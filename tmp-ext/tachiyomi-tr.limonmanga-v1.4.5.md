# Extension Validation Report

- Extension: tachiyomi-tr.limonmanga-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7878720572813992644
- Source name: Limon Manga
- Source language: tr
- Selected manga input: popular offset 0: En Güçlü Suikastçı Başka Dünyada (`.../en-guclu-suikastci-baska-dunyada`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | En Güçlü Suikastçı Başka Dünyada (`.../en-guclu-suikastci-baska-dunyada`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 11 | Yarattığı Dünyada Savaşan Adam (`.../yarattigi-dunyada-savasan-adam`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Sıfır Büyücü: Zaman ve Mekânın Efendisi (`.../sifir-buyucu-zaman-ve-mek-nin-efendisi`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 11 | Fazla Mesai Yapan Kahraman (`.../fazla-mesai-yapan-kahraman`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | En Güçlü Suikastçı Başka Dünyada (`.../en-guclu-suikastci-baska-dunyada`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | En Güçlü Suikastçı Başka Dünyada (`.../en-guclu-suikastci-baska-dunyada`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 124 | Bölüm 1 (`.../1-bolum-oku`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 46 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=En Güçlü Suikastçı Başka Dünyada, URL=`.../en-guclu-suikastci-baska-dunyada` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-l.efsaneler2.can.re/.../thumbnail.avif` (image/avif (format: avif), 6320 bytes, 181x272) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../en-guclu-suikastci-baska-dunyada` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-l.efsaneler2.can.re/.../thumbnail.avif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Büyü, Fantastik, Isekai, Macera, Aksiyon, Sistem |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Gündüzleri sıradan bir lise öğrencisi, geceleri yeraltı dünyasında yaşayan bir suikastçı…<br>İki farklı yüzü olan bir genç: Aragi Kai.<br><br>Antisosyal tavırları ve tuhaf havası yüzünden sınıf arkadaşları tarafından sevilmez.<br><br>Bir gün Aragi ve tüm sınıfı aniden başka bir dünyaya transfer edilir.<br>Burası kılıçların ve büyünün hüküm sürdüğü bir dünyadır.<br><br>Şaşkın öğrencilerin karşısına kendisini Leonora olarak tanıtan bir kadın çıkar ve şunu ilan eder:<br><br>“Sizler, Şeytan Kral’ı yenmek için çağrılmış Kahraman Adaylarısınız. Lütfen bize yardım edin.”<br><br>Her öğrenciye benzersiz bir yetenek, yani “İlahi Koruma” verilir.<br>Kimi telekinezi, kimi yıkıcı patlama gibi güçlü güçler kazanır.<br><br>Aragi’nin İlahi Koruması ise farklıdır:<br><br>“Yargı.”<br><br>Suikastçı geçmişi ve gizemli yeteneğiyle Aragi, bu yeni dünyada nasıl bir rol oynayacaktır? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 124 chapters |  |  |  |
| chapter dates | PASS | 124 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-l.efsaneler2.can.re/.../0.avif` (image/avif (format: avif), 68052 bytes, 1024x1536) |  |  |  |
