public class Codec {

HashMap<String,String> map=new HashMap();
int i=0;



// Encodes a URL to a shortened URL.
public String encode(String longUrl) {
String shortUrl="http://tinyurl.com/4e9iAk"+i;
map.put(shortUrl,longUrl);
i++;
return shortUrl;
}



// Decodes a shortened URL to its original URL.
public String decode(String shortUrl) {
if(map.containsKey(shortUrl)){
return map.get(shortUrl);
}
return "";
}
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));