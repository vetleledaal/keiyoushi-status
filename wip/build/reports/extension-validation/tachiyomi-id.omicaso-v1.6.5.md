# Extension Validation Report

- Extension: tachiyomi-id.omicaso-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 7347711054392056906
- Source name: Omicaso
- Source language: id
- Selected manga input: popular offset 0: ABSOLUTE STATION (`.../absolute-station`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | ABSOLUTE STATION (`.../absolute-station`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | The Jaegal Clan’s Son-in-Law for a Bowl of Jjajangmyeon (`.../the-jaegal-clan-s-son-in-law-for-a-bowl-of-jjajangmyeon`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Be Careful When Using Adult Toys (`.../be-careful-when-using-adult-toys`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ABSOLUTE STATION (`.../absolute-station`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ABSOLUTE STATION (`.../absolute-station`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 120 | Ch. 00 (`.../chapter.php <redacted query values: manga and chapter>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 4 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ABSOLUTE STATION, URL=`absolute-station` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn2.omicaso.fun/.../8243321660c46f1d0b4672c518e51cc19e31fdd6_960_1362_247411.jpeg` (image/jpeg, 89357 bytes, 600x851) |  |  |  |
| details identity | PASS | Details preserved selected URL `absolute-station` |  |  |  |
| details thumbnail URL | PASS | `https://cdn2.omicaso.fun/.../8243321660c46f1d0b4672c518e51cc19e31fdd6_960_1362_247411.jpeg` |  |  |  |
| details author | PASS | Gyogyeol |  |  |  |
| details artist | PASS | Bulgama |  |  |  |
| details genres | PASS | Drama, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Jika saya melarikan diri, bukankah saya akan bertemu pria ini? Tidak, kami akan bertemu lagi, seolah-olah itu adalah hubungan yang buruk dan tidak dapat dihindari. Tanpa kemauannya atau kemauanku sendiri. Bertemu dengannya adalah antara kebetulan dan keniscayaan. Mungkin hal itu tidak bisa dihindari. Jadi, ketika aku mengingat kembali hari itu, cuacanya dingin karena saat itu awal musim dingin, dan mungkin karena itu, itu adalah salah satu hari di mana aku merasa tidak enak badan. Bermain api dengan pria yang tidak pernah kuduga akan kutemui. Dampaknya begitu besar hingga kehidupan berubah secara tak terduga. Meskipun hidupku tidak pernah berjalan sesuai keinginanku, bukankah ini terlalu keras? <Absolute Station> adalah kisah tentang seorang wanita yang mengetahui bahwa seorang pria lebih berbahaya daripada siapa pun di dunia, tetapi tidak punya pilihan selain masuk ke wilayahnya. Link donasi: https://ko-fi.com/.../moccacino https://trakteer.id/.../tip<br><br>Alternative Name: 절대역 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 120 chapters |  |  |  |
| chapter dates | PASS | 120 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn2.omicaso.fun/.../001-987.webp` (image/webp (encoding: lossy), 56060 bytes, 1280x720) |  |  |  |
