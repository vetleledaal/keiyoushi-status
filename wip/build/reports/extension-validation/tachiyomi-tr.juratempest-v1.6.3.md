# Extension Validation Report

- Extension: tachiyomi-tr.juratempest-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8286382933548342026
- Source name: JuraTempest
- Source language: tr
- Selected manga input: popular offset 0: Gül Kokulu Menekşeler Zarafetle Açar (`.../gul-kokulu-menekseler-zarafetle-acar`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Gül Kokulu Menekşeler Zarafetle Açar (`.../gul-kokulu-menekseler-zarafetle-acar`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Yalnız Yükseliş: Ragnarök (`.../yalniz-yukselis-ragnarok`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 7 | Bir Eziğe Nasıl Aşık Olunur? (`.../bir-ezige-nasil-asik-olunur`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Gül Kokulu Menekşeler Zarafetle Açar (`.../gul-kokulu-menekseler-zarafetle-acar`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Gül Kokulu Menekşeler Zarafetle Açar (`.../gul-kokulu-menekseler-zarafetle-acar`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 223 | Bölüm 1 (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 54 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 7 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Gül Kokulu Menekşeler Zarafetle Açar, URL=`gul-kokulu-menekseler-zarafetle-acar` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.juratempe.st/.../087e6b06-7b03-4a79-927e-8d80631933bf.avif` (image/avif (format: avif), 357641 bytes, 2717x4063) |  |  |  |
| details identity | PASS | Details preserved selected URL `gul-kokulu-menekseler-zarafetle-acar` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.juratempe.st/.../087e6b06-7b03-4a79-927e-8d80631933bf.avif` |  |  |  |
| details author | PASS | Mikami Saka |  |  |  |
| details artist | PASS | Mikami Saka |  |  |  |
| details genres | PASS | Komedi, Romantik, Hayattan Kesitler, Okul Hayatı, Aşk Üçgeni, Gündelik Hayat |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Belirli bir yerde, komşu iki lise vardır: Aptalların toplandığı dibe vurmuş bir erkek lisesi olan Chidori ve köklü bir kız lisesi olan Kikyou. Chidori lisesinde ikinci sınıf olan sessiz ve sert Rintaro Tsumugi, ailesinin pasta dükkanına yardım ederken daimi müşterilerinden olan Kaoruko Waguri ile tanışır. Kaoruko ile geçirdiği zamanı Rintaro her ne kadar rahatlatıcı bulsa da o, Chidori lisesinden nefret eden Kikyou'nun bir öğrencisidir. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 223 chapters |  |  |  |
| chapter dates | PASS | 223 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.juratempe.st/.../6f25068b-388e-4f1a-bc3a-7970172d3857.avif` (image/avif (format: avif), 116318 bytes, 960x1378) |  |  |  |
