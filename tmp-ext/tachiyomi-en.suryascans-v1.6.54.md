# Extension Validation Report

- Extension: tachiyomi-en.suryascans-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source theme: keyoapp
- Source ID: 1061713767402958340
- Source name: Genz Toons
- Source language: en
- Selected manga input: popular offset 0: Chronicles of the Blood Demon (`.../chronicles-of-the-blood-demon`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 230 | Chronicles of the Blood Demon (`.../chronicles-of-the-blood-demon`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 197 | The Outcast Is Too Good at Martial Arts (`.../the-outcast-is-too-good-at-martial-arts`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Chronicles of the Blood Demon (`.../chronicles-of-the-blood-demon`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Chronicles of the Blood Demon (`.../chronicles-of-the-blood-demon`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Chapter 1 (`.../65ae640274b-65ae8e7ac0c`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | 1-10s |

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
| popular listing | PASS | 230 entries |  |  |  |
| latest listing | PASS | 197 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chronicles of the Blood Demon, URL=`.../chronicles-of-the-blood-demon` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 428/428 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 428/428 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wsrv.nl <redacted query values: url and w>` (image/jpeg, 85020 bytes, 480x640) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../chronicles-of-the-blood-demon` |  |  |  |
| details thumbnail URL | PASS | `https://wsrv.nl <redacted query values: url and w>` |  |  |  |
| details author | PASS | 자몽소년 |  |  |  |
| details artist | PASS | 자몽소년 |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Through a fortuitous encounter, Mok Yeon becomes a vampire. After his older sister is murdered by a corrupt martial artist from the orthodox faction, he vows revenge—and decides to tear the martial world apart.<br><br>Alternative Titles:<br>- 혈마전기 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../65ae8e7ac0c.avif` (image/avif (format: avif), 339887 bytes, 900x13300) |  |  |  |
