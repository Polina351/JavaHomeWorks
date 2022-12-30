package Seminar2;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class SqlRequest {
    /*Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя
    StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
    Если значение null, то параметр не должен попадать в запрос.
    Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
    */
    public static void main(String[] args) {
        JSONObject data = new JSONObject("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
        Map<String, Object> params1 = new HashMap<String,Object>(data.toMap());
        StringBuilder request = new StringBuilder();
        System.out.println(params1);
        String sqlRequest = getQuery(params1);
        System.out.println(sqlRequest);
    }
    public static String getQuery(Map<String, Object> params) {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,Object> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();
    }
}
