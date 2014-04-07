main activity page
package com.src.recommendationsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.List;
import android.util.Log;


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
            else if (method == "GET") {
                String paramString = URLEncodedUtils.format(params, "utf-8");
                url += "?" + paramString;
                HttpGet httpGet = new HttpGet("http://localhost:8983/solr/collection3_shard1_replica1");
                HttpResponse httpResponse = httpClient.execute(httpGet);
                HttpEntity httpEntity = httpResponse.getEntity();
                httpResponseStream = httpEntity.getContent();
            }
            else if (method == "GET") {
                String paramString = URLEncodedUtils.format(params, "utf-8");
                url += "?" + paramString;
                HttpGet httpGet = new HttpGet("http://localhost:8983/solr/collection3_shard1_replica1");
                HttpResponse httpResponse = httpClient.execute(httpGet);
                HttpEntity httpEntity = httpResponse.getEntity();
                httpResponseStream = httpEntity.getContent();
            }


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader httpResponseReader = new BufferedReader(
                    new InputStreamReader(httpResponseStream, "iso-8859-1"), 8);
            String line = null;
            jsonString = "";
            while ((line = httpResponseReader.readLine()) != null) {
                jsonString += (line + "\n");
            }
            httpResponseStream.close();
        } catch (Exception e) {
            Log.e("Buffer Error", "Error converting result " + e.toString());
        }

        try {
            return new JSONObject(jsonString);
        } catch (JSONException e) {
            Log.e("JSON Parser", "Error parsing data " + e.toString());
            return null;
        }
    }
}	
	((Button) findViewById(R.id.btnLogin)).setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
		
			Intent i = new Intent(getApplicationContext(), BrandActivity.class);
			startActivity(i);
				});
	
	}

	}
