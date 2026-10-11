# Extension Validation Report

- Extension: tachiyomi-id.holotoon-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3970113862660733375
- Source name: Holotoon
- Source language: id
- Selected manga input: popular offset 0: ABSOLUTE STATION [MOCCACINNO] (`.../absolute-station-moccacinno`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | ABSOLUTE STATION [MOCCACINNO] (`.../absolute-station-moccacinno`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | The Annex Lights Never Go Out [ARTEMIS] (`.../the-annex-lights-never-go-out-artemis`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Unofficial CC [ARTEMIS x MOCCACINNO] (`.../unofficial-cc-artemis`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | THE MASTER APPEARED [ ZEAINSHAL ] (`.../the-master-appeared`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | MOM'S FRIEND'S SON'S OBSERVATION [MOCCACINNO] (`.../moms-friends-sons-observation-moccacinno`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ABSOLUTE STATION [MOCCACINNO] (`.../absolute-station-moccacinno`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 105 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 10: title=ABSOLUTE STATION \[MOCCACINNO\], URL=`.../absolute-station-moccacinno` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://holo.imgsvr.my.id/.../yrJu-IkvbIg-.webp` (image/webp (encoding: lossy), 45964 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../absolute-station-moccacinno` |  |  |  |
| details thumbnail URL | PASS | `https://holo.imgsvr.my.id/.../yrJu-IkvbIg-.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Comedy, Drama, Full Color, Romance, Smut |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Jika saya melarikan diri, bukankah saya akan bertemu pria ini? Tidak, kami akan bertemu lagi, seolah-olah itu adalah hubungan yang buruk dan tidak dapat dihindari. Tanpa kemauannya atau kemauanku sendiri. Bertemu dengannya adalah antara kebetulan dan keniscayaan. Mungkin hal itu tidak bisa dihindari. Jadi, ketika aku mengingat kembali hari itu, cuacanya dingin karena saat itu awal musim dingin, dan mungkin karena itu, itu adalah salah satu hari di mana aku merasa tidak enak badan. Bermain api dengan pria yang tidak pernah kuduga akan kutemui. Dampaknya begitu besar hingga kehidupan berubah secara tak terduga. Meskipun hidupku tidak pernah berjalan sesuai keinginanku, bukankah ini terlalu keras? adalah kisah tentang seorang wanita yang mengetahui bahwa seorang pria lebih berbahaya daripada siapa pun di dunia, tetapi tidak punya pilihan selain masuk ke wilayahnya. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 105 chapters |  |  |  |
| chapter dates | PASS | 105 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 403 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
