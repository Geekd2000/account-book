package com.potatogeek.bookkeeping;

import com.alibaba.fastjson.JSON;
import com.potatogeek.bookkeeping.poho.User;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.search.fetch.subphase.FetchSourceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookkeepingEngineApplicationTests {

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    // 测试创建索引
    @Test
    void testCreateIndex() throws Exception {
        // 1、创建索引请求
        CreateIndexRequest request = new CreateIndexRequest("yezai_index");
        // 2、客户端执行请求 IndexResponse
        CreateIndexResponse createIndexResponse = restHighLevelClient.indices().create(request, RequestOptions.DEFAULT);
        System.out.println(createIndexResponse);
    }

    // 测试获取索引,判断其是否存在
    @Test
    void testExistIndex() throws Exception {
        GetIndexRequest request = new GetIndexRequest("yezai_index ");
        boolean exists = restHighLevelClient.indices().exists(request, RequestOptions.DEFAULT);
        System.out.println(exists);
    }

    // 测试删除索引
    @Test
    void testDeleteIndex() throws Exception {
        DeleteIndexRequest request = new DeleteIndexRequest("yezai_index");
        AcknowledgedResponse delete = restHighLevelClient.indices().delete(request, RequestOptions.DEFAULT);
        System.out.println(delete.isAcknowledged());
    }

    // 测试添加文档
    @Test
    void testAddDocument() throws Exception {
        User user = new User("江俊烨","1");
        // 创建请求
        IndexRequest request = new IndexRequest("yezai_index");
        // 规则
        request.id("1");
        request.timeout(TimeValue.timeValueSeconds(1));

        // 将数据放入请求
        request.source(JSON.toJSONString(user), XContentType.JSON);
        // 客户端发送请求
        IndexResponse response = restHighLevelClient.index(request, RequestOptions.DEFAULT);

        System.out.println(response.toString());
    }

    // 获取文档，判断是否存在
    @Test
    void testIsExist() throws Exception{
        GetRequest request = new GetRequest("yezai_index", "1");
        // 不获取返回的 _source 的上下文
        request.fetchSourceContext(new FetchSourceContext(false));
        request.storedFields("_none_");

        boolean exists = restHighLevelClient.exists(request, RequestOptions.DEFAULT);
        System.out.println(exists);
    }

    // 获取文档的信息
    @Test
    void testIsExistDocument() throws Exception{
        GetRequest request = new GetRequest("yezai_index", "1");

        GetResponse response = restHighLevelClient.get(request, RequestOptions.DEFAULT);
        System.out.println(response.getSourceAsString());
        System.out.println(response);
    }

}
