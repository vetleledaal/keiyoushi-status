# Extension Validation Report

- Extension: tachiyomi-fr.sushiscan-v1.6.17
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 6516188872647980679
- Source name: Sushi-Scan
- Source language: fr
- Selected manga input: popular offset 0: One Piece (`.../one-piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | One Piece (`.../one-piece`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Secret’R (`.../secretr`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Black Clover (`.../black-clover`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Promenons-nous dans l’espace (`.../promenons-nous-dans-lespace`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 7 | One Piece (`.../one-piece`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../one-piece`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 293 | Volume 1 (`.../one-piece-volume-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 203 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../one-piece` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 127/127 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 127/127 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sushiscan.net/.../OnePieceCov.jpg <redacted query values: ver>` (image/jpeg, 127454 bytes, 1440x2234) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-piece` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://sushiscan.net/.../OnePieceCov.jpg` (image/jpeg, 127454 bytes, 1440x2234) |  |  |  |
| details author | PASS | Oda Eiichiro |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Aventure, Comédie, Drame, Fantastique, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Fortune, gloire et pouvoir, c’est ce que possédait Gold Roger, le tout puissant roi des pirates, avant de mourir sur l’échafaud. Mais ses dernières paroles ont éveillées bien des convoitises, et lança la fabuleuse « ère de la piraterie », chacun voulant trouver le fabuleux trésor qu’il disait avoir laissé. Bien des années plus tard, Shanks, un redoutable pirate aux cheveux rouges, rencontre Luffy, un jeune garçon d’une dizaine d’années dans un petit port de pêche. Il veut devenir pirate et le rejoindre, mais Shanks lui répond qu’il est trop jeune. Plus tard, Luffy avalera accidentellement le fruit Gomu Gomu qui rendra son corps élastique, mais aussi maudit par les eaux. Incapable de nager, Luffy ne veut pourtant pas renoncer à son rêve. Pour le consoler lorsqu’il part, Shanks lui offre son chapeau. Luffy jure alors de le rejoindre un jour avec son propre équipage. A 17 ans, Luffy prend la mer dans une petite barque avec pour but de réunir un équipage de pirates, mais de pirates pas comme les autres, qui devront partager sa conception un peu étrange de la piraterie. L’aventure est lancée. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 293 chapters |  |  |  |
| chapter dates | LINT | 49 of 293 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=49 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 203 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://c1.sushiscan.net/.../OnePieceTome1-001.jpg` (image/jpeg, 709977 bytes, 1920x3005) |  |  |  |
