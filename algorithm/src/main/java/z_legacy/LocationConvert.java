package z_legacy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LocationConvert {
	public static void main(String[] args) throws IOException {
		String inputFile = "D:\\code.txt";
		String outputFile = "D:\\code_convert.txt";

		StringBuilder sqlBuilder = new StringBuilder();
		sqlBuilder.append("INSERT INTO `location` (`code`, `city`, `district`, `town`) VALUES \n");

		Path inputPath = Paths.get(inputFile);
		try (BufferedReader reader = Files.newBufferedReader(inputPath, Charset.forName("EUC-KR"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] fields = line.split("\t");
				String[] names = fields[1].split(" ");
				if (names.length == 3) { // 도시, 구, 동 정보가 모두 있는 경우에만 처리
					sqlBuilder.append(
						String.format("('%s', '%s', '%s', '%s'),\n", fields[0], names[0], names[1], names[2]));
				}
			}
		}

		sqlBuilder.deleteCharAt(sqlBuilder.lastIndexOf(","));
		sqlBuilder.append(";");

		Path outputPath = Paths.get(outputFile);
		try (PrintWriter writer = new PrintWriter(
			new OutputStreamWriter(Files.newOutputStream(outputPath), StandardCharsets.UTF_8))) {
			writer.print(sqlBuilder.toString());
		}
	}
}
