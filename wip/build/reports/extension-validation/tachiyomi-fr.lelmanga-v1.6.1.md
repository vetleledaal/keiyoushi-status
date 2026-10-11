# Extension Validation Report

- Extension: tachiyomi-fr.lelmanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 8647761747185981431
- Source name: Lelmanga
- Source language: fr
- Selected manga input: popular offset 0: One Piece (`.../one-piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | One Piece (`.../one-piece`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Hunter X Hunter (`.../hunter-x-hunter`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | The Regressed Son Of A Duke Is An Assassin (`.../the-regressed-son-of-a-duke-is-an-assassin`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Solo Max Level Newbie (`.../solo-max-level-newbie`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | One Piece (`.../one-piece`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../one-piece`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 190 | Chapitre 1009 (`.../one-piece-1009`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../one-piece` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../One-Piece.jpg <redacted query values: resize>` (image/jpeg, 29716 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-piece` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i3.wp.com/.../One-Piece.jpg` (image/jpeg, 25482 bytes, 250x350) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Aventure, Comédie, Fantastique, Shônen, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Gloire, fortune et puissance, c’est ce que possédait Gold Roger, le tout puissant roi des pirates, avant de mourir sur l’échafaud. Mais ses dernières paroles ont éveillées bien des convoitises, et lança la fabuleuse “ère de la piraterie”, chacun voulant trouver le fabuleux trésor qu’il disait avoir laissé. Bien des années plus tard, Shanks, un redoutable pirate aux cheveux rouges, rencontre Luffy, un jeune garçon d’une dizaine d’années dans un petit port de pêche. Il veut devenir pirate et le rejoindre, mais Shanks lui répond qu’il est trop jeune. Plus tard, Luffy avalera accidentellement le fruit Gomu Gomu qui rendra son corps élastique, mais aussi maudit par les eaux. Incapable de nager, Luffy ne veut pourtant pas renoncer à son rêve. Pour le consoler lorsqu’il part, Shanks lui offre son chapeau. Luffy jure alors de le rejoindre un jour avec son propre équipage. A 17 ans, Luffy prend la mer dans une petite barque avec pour but de réunir un équipage de pirates, mais de pirates pas comme les autres, qui devront partager sa conception un peu étrange de la piraterie. L’aventure est lancée. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 190 chapters |  |  |  |
| chapter dates | PASS | 190 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.lelmanga.com/.../manga <redacted query values: page and order>` to `https://www.lelmanga.com/.../manga <redacted query values: page and order>` (1 redirects); popular: `https://www.lelmanga.com/.../manga <redacted query values: page and order>` to `https://www.lelmanga.com/.../manga <redacted query values: page and order>` (1 redirects); popular: `https://www.lelmanga.com/.../manga <redacted query values: page and order>` to `https://www.lelmanga.com/.../manga <redacted query values: page and order>` (1 redirects); popular: `https://www.lelmanga.com/.../manga <redacted query values: title, page, status, type, and order>` to `https://www.lelmanga.com/.../manga <redacted query values: title, page, status, type, and order>` (1 redirects); popular: `https://www.lelmanga.com/.../manga <redacted query values: page and order>` to `https://www.lelmanga.com/.../manga <redacted query values: page and order>` (1 redirects) |  |  |  |
| page load | PASS | `https://i0.wp.com/.../002-1.png <redacted query values: lmv>` (image/png, 994877 bytes, 1771x1300) |  |  |  |
