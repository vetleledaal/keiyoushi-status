# Extension Validation Report

- Extension: tachiyomi-tr.arcurafansub-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 4787423248001527550
- Source name: Arcura Fansub
- Source language: tr
- Selected manga input: latest offset 0: Negative Psychological Distance (`.../negative-psychological-distance`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Olgami (`.../olgami`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Olgami (`.../olgami`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Negative Psychological Distance (`.../negative-psychological-distance`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Negative Psychological Distance (`.../negative-psychological-distance`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Negative Psychological Distance (`.../negative-psychological-distance`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Negative Psychological Distance (`.../negative-psychological-distance`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 40 | Chapter 0 (`.../negative-psychological-distance-0-bolum`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 3 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Negative Psychological Distance, URL=`.../negative-psychological-distance` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../negative-psychological-distance.png <redacted query values: resize>` (image/png, 23987 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../negative-psychological-distance` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../negative-psychological-distance.png` (image/png, 322368 bytes, 720x955) |  |  |  |
| details author | PASS | Zhuang Ning,杀意 |  |  |  |
| details artist | PASS | 止鱼 |  |  |  |
| details genres | PASS | Dram, Gizem, Psikolojik, Shounen ai, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Bir gün Doktor Shen siqing’in psikiyatri kliniğine garip bir hasta gelir. Bu hastanın tuhaf davranışlarından şüphelenen shen aynı zamanda gizemlerle dolu bir tuzağa çekildiğinden tamamen habersizdir. Tuzak kurulmasının sebebi nedir? Peki ya geçmişin derinliklerinde neler gömülü? Shen bunları çözebilecek mi yoksa gizemlerin belirsizliğinde kaybolup gidecek mi?<br><br>Alternative Names: Let Me In, Xin Li Fu Ju Li, 心理负距离 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 40 chapters |  |  |  |
| chapter dates | PASS | 40 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://arcurafansub.com/.../seri <redacted query values: title, page, and order>` to `https://arcurafansub.com/.../seri-listesi <redacted query values: title and order>` (1 redirects); popular_next: `https://arcurafansub.com/.../seri <redacted query values: title, page, and order>` to `https://arcurafansub.com/.../seri-listesi <redacted query values: title and order>` (2 redirects); latest: `https://arcurafansub.com/.../seri <redacted query values: title, page, and order>` to `https://arcurafansub.com/.../seri-listesi <redacted query values: title and order>` (1 redirects); latest_next: `https://arcurafansub.com/.../seri <redacted query values: title, page, and order>` to `https://arcurafansub.com/.../seri-listesi <redacted query values: title and order>` (2 redirects); search: `https://arcurafansub.com/.../seri <redacted query values: title, page, author, yearx, status, type, and order>` to `https://arcurafansub.com/.../seri-listesi <redacted query values: title, author, yearx, status, type, and order>` (1 redirects) |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../0.jpg` (image/webp (container: extended), 70696 bytes, 800x642) |  |  |  |
