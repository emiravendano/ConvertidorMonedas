public class ConvertidoDeMoneda {
    private static final String API_URL = "URL_DEL_JSON";

    public CurrencyConverterAPIResponse getCurrencyConversionData() throws IOException {
        URL url = new URL(API_URL);
        Scanner scanner = new Scanner(url.openStream());
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine());
        }
        scanner.close();
        String json = stringBuilder.toString();
        Gson gson = new Gson();
        return gson.fromJson(json, CurrencyConverterAPIResponse.class);
    }
}
