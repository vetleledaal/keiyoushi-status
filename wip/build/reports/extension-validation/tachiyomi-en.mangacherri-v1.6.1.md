# Extension Validation Report

- Extension: tachiyomi-en.mangacherri-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9127501903906189261
- Source name: MangaCherri
- Source language: en
- Selected manga input: popular offset 0: The Ramparts of Ice (`.../the-ramparts-of-ice`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | The Ramparts of Ice (`.../the-ramparts-of-ice`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Koibami Shoujo (`.../koibami-shoujo`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Journey Home After School (`.../journey-home-after-school`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Tsuzura-senpai Is My Ex-Girlfriend (`.../tsuzura-senpai-is-my-ex-girlfriend`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Ramparts of Ice (`.../the-ramparts-of-ice`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Ramparts of Ice (`.../the-ramparts-of-ice`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 118 | Chapter 1 (`.../33560`) |  | <1s |
| pages | `getPageList(chapter)` | success | 34 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Ramparts of Ice, URL=`the-ramparts-of-ice` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangacherri.com/.../732.webp` (image/webp (encoding: lossy), 62606 bytes, 600x853) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-ramparts-of-ice` |  |  |  |
| details thumbnail URL | PASS | `https://mangacherri.com/.../732.webp` |  |  |  |
| details author | PASS | Agasawa Koucha |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, Romance, Slice of Life, School, Shoujo |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Inept at dealing with people, Hikawa Koyuki maintains a wall between herself and others. She spends her time in highschool away from others, all alone. At least until she encounters Amamiya Minato who keeps closing the distance between them for some reason?! The aloof Koyuki, the popular Miki, the boundary-less Minato, and the easygoing and kind basketball team member, Youta. This is the story of these somewhat complicated four, and their tantalizing, bumbling youth!<br><br>**Alternative Names:**<br>- Koori no Jouheki, 氷の城壁<br>- Ice Castle Wall |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 118 chapters |  |  |  |
| chapter dates | PASS | 118 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 34 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangacherri.com/.../p0001.webp` (image/webp (encoding: lossy), 162402 bytes, 1350x1500) |  |  |  |
