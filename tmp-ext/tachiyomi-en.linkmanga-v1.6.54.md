# Extension Validation Report

- Extension: tachiyomi-en.linkmanga-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8622937201319058235
- Source name: LinkManga
- Source language: en
- Selected manga input: popular offset 0: Ojisan to Ore no Koiwazurai (`.../58265`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Ojisan to Ore no Koiwazurai (`.../58265`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Motoyan Papa to Hitsuji-sensei (`.../63629`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Kengan Omega (`.../30073`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Returned Solider’s Female Conquest Diary (`.../58039`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ojisan to Ore no Koiwazurai (`.../58265`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ojisan to Ore no Koiwazurai (`.../58265`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | chapter 1 (`.../ch-001`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ojisan to Ore no Koiwazurai, URL=`58265` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://linkmanga.com/.../cover-58265-175x238.jpg` (image/jpeg, 14930 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `58265` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://linkmanga.com/.../cover-58265-193x278.jpg` (image/jpeg, 18176 bytes, 193x278) |  |  |  |
| details author | PASS | HINO Youhe |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Smut, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Siincee Kanamee was a young boy, hee’s shareed a seecreet wiith hiis unclee Takashii: That both of theem aree gay. Hee takees iit upon hiimseelf to cheeeer hiis unclee up wheeneeveer hiis heeart geets brokeen. Though afteer not seeeeiing hiim for teen yeears, Kanamee seeeems to havee falleen riight back iinto thiis rolee. eexceept, only onee thiing has changeed…hiis feeeeliings. Hee comforts hiis unclee so many tiimees, but afteer hiis feeeeliings buiild up, Kanamee can’t hold back any longeer. “Leet mee stand iin for theem.“ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://f1link.linkmanga.com/.../f20190802_15465d_1336.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
