# Extension Validation Report

- Extension: tachiyomi-tr.arcurafansub-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 4787423248001527550
- Source name: Arcura Fansub
- Source language: tr
- Selected manga input: popular offset 0: Olgami (`.../olgami`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Olgami (`.../olgami`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Olgami (`.../olgami`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Stay With Me (`.../stay-with-me`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Stay With Me (`.../stay-with-me`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Olgami (`.../olgami`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Olgami (`.../olgami`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 161 | Chapter 0. Bölüm - Mirai'den açıklama ve izinler (`.../olgami-0-bolum`) |  | <1s |
| pages | `getPageList(chapter)` | success | 2 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Olgami, URL=`.../olgami` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../bx133795-S1VPpnLNL52r.jpg <redacted query values: resize>` (image/jpeg, 7762 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../olgami` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i3.wp.com/.../bx133795-S1VPpnLNL52r.jpg` (image/jpeg, 42767 bytes, 460x666) |  |  |  |
| details author | PASS | Hae Mu Ri |  |  |  |
| details artist | PASS | Hae Mu Ri |  |  |  |
| details genres | PASS | Dram, Gizem, Psikolojik, Romantik, Shoujo, Supernatural, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Chae Ah taksi şoförü olarak çalışmaktadır, bir gün kilisesinden Park Yoon Soo adında bir adamın bir kadınla birlikte yürüdüğünü görür. Bu basit vizyon onun hayatını alt üst edecek ve suç, baskı ve keşfedilecek sırlarla dolu bir dünyaya düşmesine neden olacaktır. “Smartwatch Straps And” ile tarzınızı yükseltin horlogebandjesEn İyi Saatler! Her duruma uygun birinci sınıf saat bantlarımızla akıllı saat oyununuzu bir üst seviyeye taşıyın. Her ihtiyacınızı karşılamak üzere tasarlanmış telefon aksesuarları yelpazemizle bağlantıda kalın ve şık olun.<br><br>Alternative Names: <br>- Loop (Haemuri)<br>- Olgami<br>- Петля<br>- 陷阱 (Haemuri)<br>- 올가미 (해무리) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 161 chapters |  |  |  |
| chapter dates | PASS | 161 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://arcurafansub.com/.../seri <redacted query values: page and order>` to `https://arcurafansub.com/.../seri-listesi <redacted query values: order>` (1 redirects); popular: `https://arcurafansub.com/.../seri <redacted query values: page and order>` to `https://arcurafansub.com/.../seri-listesi <redacted query values: order>` (1 redirects); popular: `https://arcurafansub.com/.../seri <redacted query values: page and order>` to `https://arcurafansub.com/.../seri-listesi <redacted query values: order>` (2 redirects); popular: `https://arcurafansub.com/.../seri <redacted query values: title, page, status, type, and order>` to `https://arcurafansub.com/.../seri-listesi <redacted query values: title, status, type, and order>` (1 redirects); popular: `https://arcurafansub.com/.../seri <redacted query values: page and order>` to `https://arcurafansub.com/.../seri-listesi <redacted query values: order>` (2 redirects) |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../olgami1111.jpg` (image/webp (container: extended), 185842 bytes, 720x1100) |  |  |  |
