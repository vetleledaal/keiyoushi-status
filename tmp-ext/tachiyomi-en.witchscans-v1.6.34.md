# Extension Validation Report

- Extension: tachiyomi-en.witchscans-v1.6.34
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3119719730967642939
- Source name: WitchScans
- Source language: en
- Selected manga input: popular offset 0: Ultimate Son-in-Law (`.../cmsgqhwdc29xyo5qk6rxarl2d`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Ultimate Son-in-Law (`.../cmsgqhwdc29xyo5qk6rxarl2d`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | GLOBAL GAME: I CAN BOOST EVERYTHING A HUNDRED TIMES (`.../cmt6f6aq70000u1qkalhqoa6a`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Global: The Fusionist, Starting With An Undead Army (`.../cmt0lurys000dqxqkt8gdbn5v`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Dragon Tamer: Scales Against the Heavens (`.../cmsgsxrlx109tidqkcmqk4yf3`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ultimate Son-in-Law (`.../cmsgqhwdc29xyo5qk6rxarl2d`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ultimate Son-in-Law (`.../cmsgqhwdc29xyo5qk6rxarl2d`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 401 | Chapter 1 (`.../cmsgyfbi802gedtqk2gj8hamh`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ultimate Son-in-Law, URL=`cmsgqhwdc29xyo5qk6rxarl2d` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Dragon Tamer: Scales Against the Heavens, URL=`cmsgsxrlx109tidqkcmqk4yf3` at page 1 offset 23 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://witchtoons.net/.../cover.webp` (image/webp (container: extended), 2702088 bytes, 450x605) |  |  |  |
| details identity | PASS | Details preserved selected URL `cmsgqhwdc29xyo5qk6rxarl2d` |  |  |  |
| details thumbnail URL | PASS | `https://witchtoons.net/.../cover.webp` |  |  |  |
| details author | PASS | Witchscans |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | MANHUA, CHINESE, Action, Drama, Ecchi, Martial Arts, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Sheng Lang was kicked out from his house for being a waste of food and oxygen, things happened and he end up in another world, to survive in this new world he needs to learn material arts but since he’s way too lazy and weak he concluded that his best option is to find a rich talented pretty wife and just be a trophy husband who spends his days enjoying the riches of life! And if anyone dared to disturb his peace he’ll tell his wife to kick their asses<br><br>Rating: 10.0<br>Type: MANHUA<br>Origin: CHINESE |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 401 chapters |  |  |  |
| chapter dates | PASS | 401 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://witchtoons.net/.../page-001.webp <redacted query values: sig and exp>` (image/webp (encoding: lossy), 1383044 bytes, 800x13000) |  |  |  |
