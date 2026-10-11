# Extension Validation Report

- Extension: tachiyomi-it.mangaworld-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangaworld
- Source ID: 7114846210461894145
- Source name: Mangaworld
- Source language: it
- Selected manga input: popular offset 0: One Piece (`.../one-piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | One Piece (`.../one-piece`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 16 | Naruto (`.../naruto`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 16 | Three Mouthwatering Meals for Two (`.../three-delicious-meals-just-the-two-of-us`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 16 | The Return of the Crazy Demon (`.../return-of-the-mad-demon`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 6 | Nami VS Kalifa (`.../nami-vs-kalifa`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../one-piece`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1197 | Capitolo 00 (`.../5fa0d57e9c5b631f15d5b491 <redacted query values: style>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=One Piece, URL=`.../one-piece` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 70/70 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 70/70 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangaworld.mx/.../5fa0c9e2c9f2201ee55d3bd4.jpg <redacted query values: 1791722896736>` (image/jpeg, 424061 bytes, 760x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-piece` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.mangaworld.mx/.../5fa0c9e2c9f2201ee55d3bd4.jpg <redacted query values: 1791713310161>` (image/jpeg, 424061 bytes, 760x1200) |  |  |  |
| details author | PASS | ODA Eiichiro |  |  |  |
| details artist | PASS | ODA Eiichiro |  |  |  |
| details genres | PASS | Azione, Avventura, Commedia, Drammatico, Fantasy, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Monkey D. Rufy è un giovane pirata sognatore che da piccolo ha inavvertitamente mangiato il frutto del diavolo Gom Gom che lo rende "elastico", permettendogli di allungarsi e deformarsi a piacimento, a scapito, però, della capacità di nuotare. L'obiettivo che lo ha spinto in mare è quello ambizioso di diventare il "re dei pirati". Dovrà, dunque, ritrovare il leggendario "One Piece", il magnifico tesoro lasciato dal mitico pirata Gold Roger sull'isola di Raftel, alla fine della Rotta Maggiore, mai ritrovato e sogno di ogni pirata. Nella sua avventura, Rufy riunirà intorno a lui una ciurma ben assortita, e si troverà in mezzo a situazioni bizzarre e stravaganti, tanto almeno quanto lo sono i personaggi, amici o nemici, presenti nell'universo che lo circonda, che raggiungono spesso livelli assurdi e grotteschi e che donano all'opera un'atmosfera surreale e divertente.<br><br>Titoli alternativi: Budak Getah, Đảo Hải Tặc, Большой куш, Ван Пис, Уан Пийс, Эйтиро Ода, Վան Փիս, וואן פיס, قطعة واحدة, وان پیس, ون بيس, وەن پیس, वान पिस, वान् पीस, ওয়ান পিস, ஒன் பீஸ், วันพีซ, ဝမ်းပိစ်, ዋንፒስ, ワンピース, 海盗路飞, 海賊王, 海贼王, 航海王, 원피스, OP |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1197 chapters |  |  |  |
| chapter dates | PASS | 1197 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.mangaworld.mx/.../1.jpg` (image/jpeg, 978956 bytes, 798x1150) |  |  |  |
