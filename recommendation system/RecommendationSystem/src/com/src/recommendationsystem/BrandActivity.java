public class Main_activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.brand_activity);
		
		

public class JSONParser {

    static InputStream httpResponseStream = null;
    static String jsonString = "";

    public JSONObject makeHttpRequest(String url, String method,
            List<NameValuePair> params) {

        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();

            if (method == "POST") {
                HttpPost httpPost = new HttpPost(String urlString = "http://localhost:8983/solr/collection3_shard1_replica1";
SolrServer solr = new HttpSolrServer(urlString);

);
                httpPost.setEntity(new UrlEncodedFormEntity(params));
                HttpResponse httpResponse = httpClient.execute(httpPost);
                HttpEntity httpEntity = httpResponse.getEntity();
                httpResponseStream = httpEntity.getContent();
            }
