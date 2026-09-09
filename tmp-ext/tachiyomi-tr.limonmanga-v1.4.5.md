# Extension Validation Report

- Extension: tachiyomi-tr.limonmanga-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: uzaymanga
- Source ID: 7878720572813992644
- Source name: Limon Manga
- Source language: tr
- Selected manga input: latest offset 0: Sıfır Büyücü: Zaman ve Mekânın Efendisi (`.../sifir-buyucu-zaman-ve-mek-nin-efendisi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | En Güçlü Suikastçı Başka Dünyada (`.../en-guclu-suikastci-baska-dunyada`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 11 | Yarattığı Dünyada Savaşan Adam (`.../yarattigi-dunyada-savasan-adam`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Sıfır Büyücü: Zaman ve Mekânın Efendisi (`.../sifir-buyucu-zaman-ve-mek-nin-efendisi`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 11 | Fazla Mesai Yapan Kahraman (`.../fazla-mesai-yapan-kahraman`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Sıfır Büyücü: Zaman ve Mekânın Efendisi (`.../sifir-buyucu-zaman-ve-mek-nin-efendisi`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Sıfır Büyücü: Zaman ve Mekânın Efendisi (`.../sifir-buyucu-zaman-ve-mek-nin-efendisi`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 72 | Bölüm 1 (`.../1-bolum-oku`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 85 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sıfır Büyücü: Zaman ve Mekânın Efendisi, URL=`.../sifir-buyucu-zaman-ve-mek-nin-efendisi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-l.efsaneler2.can.re/.../thumbnail.avif` (image/avif (format: avif), 7154 bytes, 181x272) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sifir-buyucu-zaman-ve-mek-nin-efendisi` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-l.efsaneler2.can.re/.../thumbnail.avif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Büyü, Fantastik, Geçmişe-dönme, Macera, Okul, Zindan, Aksiyon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Batı takvimine göre yıl 2054.<br>Japonya büyü teknolojisinde dünyanın tartışmasız lideri haline gelmiştir.<br><br>Ancak Kujyou Haruto, büyü kapasitesi sıfır olan bir öğrencidir.<br>Bu yüzden okulda herkes tarafından başarısız ve yeteneksiz biri olarak görülür.<br><br>Bir gün Haruto’ya gizemli bir mektup ulaşır.<br><br>Mektubun göndericisi ise 10 yıl sonraki kendisidir.<br><br>Gelecekteki Haruto ona şöyle der:<br><br>“Sen şu anda başarısız olan geçmişteki bensin, değil mi?<br>Ama gelecekte sen, zamanı ve mekânı kontrol edebilen bir büyücü olacaksın.<br>Bundan sonra sadece söylediklerimi yap.”<br><br>Şüphe içinde olsa da Haruto mektuptaki talimatları takip etmeye karar verir.<br><br>Bu yüzden Shinjuku İmparatorluk Bahçesi’ndeki F-Seviye zindana girer.<br><br>Ve orada kimsenin bilmediği gizli bir oda keşfeder.<br><br>Bu keşif, büyü gücü sıfır olan bir öğrencinin<br>çoklu evreni kurtaracak en güçlü zaman-mekân büyücüsüne dönüşmesinin başlangıcıdır. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 72 chapters |  |  |  |
| chapter dates | PASS | 72 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 85 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-l.efsaneler2.can.re/.../0.avif` (image/avif (format: avif), 99800 bytes, 1024x1536) |  |  |  |
