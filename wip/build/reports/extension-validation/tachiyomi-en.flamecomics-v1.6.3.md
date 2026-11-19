# Extension Validation Report

- Extension: tachiyomi-en.flamecomics-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8531542650987673943
- Source name: Flame Comics
- Source language: en
- Selected manga input: popular offset 0: Omniscient Reader's Viewpoint (`.../2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 154 | Omniscient Reader's Viewpoint (`.../2`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 154 | The Regressed Youngest Son of the Duke is an Assassin (`.../133`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Omniscient Reader's Viewpoint (`.../2`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Omniscient Reader's Viewpoint (`.../2`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 312 | Chapter 0 - Prologue (`.../0c9db8012fbd1257`) |  | <1s |
| pages | `getPageList(chapter)` | success | 64 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 154 entries |  |  |  |
| latest listing | PASS | 154 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Omniscient Reader's Viewpoint, URL=`.../2` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 309/309 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 309/309 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.flamecomics.xyz/.../thumbnail.png <redacted query values: 1785331425>` (image/png, 2152169 bytes, 1080x1540) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.flamecomics.xyz/.../thumbnail.png <redacted query values: 1785331425>` |  |  |  |
| details author | PASS | Sing-Shong |  |  |  |
| details artist | PASS | Sleepy-C, Redice Studio |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Fantasy, Survival |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | ‘This is a development that I know of.’ The moment he thought that the world had been destroyed, and a new universe had unfolded. The new life of an ordinary reader begins within the world of the novel, a novel that he alone had finished.<br><br>Alternative Names:<br>- 전지적 독자 시점<br>- 전독시<br>- Jeonjijeok Dokja Sijeom<br>- Lecteur omniscient<br>- Lector omnisciente<br>- ORV<br>- Punkt Widzenia Wszechwiedzącego Czytelnika<br>- Всеведущий читатель<br>- دیدگاه خواننده‌ی همه‌چی‌دون<br>- وجهة نظر القارئ العراف<br>- อ่านชะตาวันสิ้นโลก<br>- 全知的な読者の視点から<br>- 全知讀者視角<br>- 全知读者 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 312 chapters |  |  |  |
| chapter dates | PASS | 312 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 64 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.flamecomics.xyz/.../001-129.jpg <redacted query values: 1611792000>` (image/jpeg, 31778 bytes, 800x1000) |  |  |  |
