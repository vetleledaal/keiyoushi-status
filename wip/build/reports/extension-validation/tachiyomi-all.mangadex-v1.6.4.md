# Extension Validation Report

- Extension: tachiyomi-all.mangadex-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: eu.kanade.tachiyomi.extension.all.mangadex.MangaDex
- Source ID: 2499283573021220255
- Source name: MangaDex
- Source language: en
- Selected manga input: popular offset 0: Why Did I, An Older Women Guy, Fall In Love With The Teeny You? (`.../99e912e1-ca9d-4019-8fe8-349bf814b75e`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Why Did I, An Older Women Guy, Fall In Love With The Teeny You? (`.../99e912e1-ca9d-4019-8fe8-349bf814b75e`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Even the Demon Teacher Has a Dream! (`.../be29ba1f-d402-43fb-b7d6-50435619c2c8`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 73 | The Kingdoms of Ruin (`.../2750ed89-ea66-4c0c-ab05-7417a9e0de3e`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 78 | Legend of Star General (`.../65208a20-4253-42c8-b0e7-56524bbe795b`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Why Did I, An Older Women Guy, Fall In Love With The Teeny You? (`.../99e912e1-ca9d-4019-8fe8-349bf814b75e`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Why Did I, An Older Women Guy, Fall In Love With The Teeny You? (`.../99e912e1-ca9d-4019-8fe8-349bf814b75e`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Ch.1 (`.../399be404-bb29-4ffd-87c9-6345b7fe0a32`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | <1s |

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
| latest listing | PASS | 73 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Why Did I, An Older Women Guy, Fall In Love With The Teeny You?, URL=`.../99e912e1-ca9d-4019-8fe8-349bf814b75e` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=The Unbeatable Duo, URL=`.../c5784023-9519-4d2c-b678-9f6793049534` at page 1 offset 1 and page 2 offset 50, title=A Childhood Friend Who's Somehow Oddly Changed, URL=`.../683ae381-9447-4e31-b5b1-6f1dc9214a29` at page 1 offset 3 and page 2 offset 20, title=Vivy Run Death, URL=`.../88304b7f-eaaf-47c0-bf9b-8ae444a9995f` at page 1 offset 16 and page 2 offset 11, title=Girl and Science, URL=`.../5c9d1254-f074-4b5c-8795-6f0641b2597b` at page 1 offset 19 and page 2 offset 72, title=Blue Orchestra, URL=`.../7777c3aa-fe0f-47d6-8672-6a1d60a1a9e8` at page 1 offset 26 and page 2 offset 77, title=Daily Chaldea, URL=`.../ccb654fd-d4de-44d1-a9c1-f58ba34f3510` at page 1 offset 35 and page 2 offset 64, title=Please Follow Salamander!, URL=`.../e7bed782-c002-4299-afd9-a2900534b487` at page 1 offset 39 and page 2 offset 51, title=Lost Man, URL=`.../c86edee1-807b-4e17-b524-291ac7c2f650` at page 1 offset 55 and page 2 offset 73, title=After I Saved the Cutest Underclassman at School, She Started Coming Over Like My Wife and Pushing for a Relationship, URL=`.../48808725-f75d-4c46-b34c-2111e6b874b7` at page 1 offset 65 and page 2 offset 2, title=Legend of Star General, URL=`.../65208a20-4253-42c8-b0e7-56524bbe795b` at page 1 offset 72 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 192/192 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 192/192 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://uploads.mangadex.org/.../38deac17-3daf-436a-9b3a-08afe572835d.jpg` (image/jpeg, 776530 bytes, 836x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../99e912e1-ca9d-4019-8fe8-349bf814b75e` |  |  |  |
| details thumbnail URL | PASS | `https://uploads.mangadex.org/.../38deac17-3daf-436a-9b3a-08afe572835d.jpg` |  |  |  |
| details author | PASS | Kagami Yuu |  |  |  |
| details artist | PASS | Mitsuya Ryo |  |  |  |
| details genres | PASS | Adaptation, Web Comic, Comedy, Romance, Slice of Life, School Life, Shounen, Content rating: Suggestive, Japanese |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | During the Spring break after middle school, Tochika Sky rescues a small girl getting crushed on a crowded train. He assumes she's just an elementary schooler, until he enters high school and finds her in his classroom!?<br><br>Clocking in at just 140 centimeters and fueled by energy drinks, She may be small, but she's an absolute beauty.<br><br>Her name is Naruse Chito. Sky considers himself a true-blue lover of tall, older women, so a tiny cutie like Chito should be completely outside his romantic strike zone. However, Chito kicks off a fierce assault with a bold declaration: “I'm gonna take that obsession of yours and turn it completely upside down!”. A romcom tug-of-war over tastes between a guy who loves older women and a teeny girl begins!<br><br>Compositor: Urano Ritsu<br>Character Designer: Fuji Yama |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | FAIL | 55 of 55 pages have invalid URLs: page 1: imageUrl=`.../1-e4db8a6dc433aa384424756ac0ce28b1a9c720cc47b3e440140a1fbf287a3980.png` (relative URL), page 2: imageUrl=`.../2-a1fbc0b175232b12a29a3b76abc3c5298fb4f5e9371e59d70d0820821a0c3cc2.jpg` (relative URL), page 3: imageUrl=`.../3-c89b79ad27d6406871107ce178d28d32f33a96fa8492355eba7f3ff340edf531.jpg` (relative URL), page 4: imageUrl=`.../4-7571c6dccacfe520db3d14fea4bd3d5d3cb9be712b09a6a694a9d76a7f2a1be9.jpg` (relative URL), page 5: imageUrl=`.../5-8ececfb4e7ce94ed76be85dd554f051457eabf0fecf8f7522d8108fd51adc22f.jpg` (relative URL), and 50 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `.../1-e4db8a6dc433aa384424756ac0ce28b1a9c720cc47b3e440140a1fbf287a3980.png` (image/png, 7237896 bytes, 2304x3072) |  |  |  |
