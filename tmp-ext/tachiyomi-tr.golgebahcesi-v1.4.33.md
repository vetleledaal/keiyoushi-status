# Extension Validation Report

- Extension: tachiyomi-tr.golgebahcesi-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7442439989890509521
- Source name: Gölge Bahçesi
- Source language: tr
- Selected manga input: latest offset 0: Yargı (`.../yargi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Namgung Kılıç İmparatoru’nun Yükselişi (`.../namgung-kilic-imparatorunun-yukselisi`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Zamansız Ev (`.../zamansiz-ev`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Yargı (`.../yargi`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Havalı Olmayan Yetişkin Bayan Ji-hye (`.../havali-olmayan-yetiskin-bayan-ji-hye`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Yargı (`.../yargi`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Yargı (`.../yargi`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 6 | Bölüm 1 (`.../chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 306 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yargı, URL=`yargi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://c2.skycdn.online/.../1788363423_edc70ee07eb7303478dc15855c214281.webp` (image/webp (encoding: lossy), 535200 bytes, 1100x1430) |  |  |  |
| details identity | PASS | Details preserved selected URL `yargi` |  |  |  |
| details thumbnail URL | PASS | `https://c2.skycdn.online/.../1788363423_edc70ee07eb7303478dc15855c214281.webp` |  |  |  |
| details author | PASS | BBU |  |  |  |
| details artist | PASS | BBU |  |  |  |
| details genres | PASS | Aksiyon, Fantastik, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Gücün hem yasayı hem de düzeni belirlediği süperinsanların toplumunda, So Yeoul tüm hayatını zayıflardan biri olarak geçirmiştir. Bildiği tek şey kaçmaktır. Ancak babası güçlüler tarafından öldürüldüğünde Yeoul, intikam almaya karar verir ve Dövüş Kulesi’ne doğru yola çıkar. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | LINT | All 6 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | FAIL | 306 of 306 pages have invalid URLs: page 1: imageUrl=`.../6026e4ac8ad221c787ed1ee3.png.enc` (relative URL), page 2: imageUrl=`.../506e985f19e214cefd2ce111.jpg.enc` (relative URL), page 3: imageUrl=`.../4eb48f85cae65399806f5cb1.jpg.enc` (relative URL), page 4: imageUrl=`.../74d67d28e8bc4e6cd4a19d52.jpg.enc` (relative URL), page 5: imageUrl=`.../9e7d998fe3784caba0524ef5.jpg.enc` (relative URL), and 301 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `.../6026e4ac8ad221c787ed1ee3.png.enc` could not be downloaded: java.lang.IllegalArgumentException: Expected URL scheme 'http' or 'https' but no scheme was found for .../serie... | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
