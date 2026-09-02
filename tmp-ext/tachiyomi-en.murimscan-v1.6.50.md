# Extension Validation Report

- Extension: tachiyomi-en.murimscan-v1.6.50
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 21
- Lint: 3
- Warnings: 1
- Skipped: 10
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5524031489110351257
- Source name: MurimScan
- Source language: en
- Selected manga input: popular offset 0: The Lone Necromancer (`.../the-lone-necromancer.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | The Lone Necromancer (`.../the-lone-necromancer.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Lone Necromancer (`.../the-lone-necromancer.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Lone Necromancer (`.../the-lone-necromancer.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | The Lone Necromancer Chapter 218 (`.../the-lone-necromancer-chapter-218_02023378733.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Lone Necromancer, URL=`.../the-lone-necromancer.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 6/6 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 6/6 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.ibb.co/.../OS9jvi-JRtu-Nw-Zpl-Q73-VTIDspt-ALm-YPHPPt-BFsm3og-V3-Zcw-EShw-Favmw0-N-S9p-R84odvtg-HP7-Qu-LTLp-4s9i-Fm.webp` (image/webp (encoding: lossy), 70386 bytes, 690x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-lone-necromancer.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://lh3.googleusercontent.com/.../AEn0k_suDz9QcHWq4_Vk7Zv6vuH8V9_U5qFr--sdnGXyKa6znFmnS4J5HuOp9khVzanm6g2YlFfgxIjnzhmdf_bDm18RhFO9R9oZ4NG7AhLuwgpgp3Lj_6kxlGJuXawuhEiCK7oztaCQQASnrbAefyzuxpKSKIbvPva-L9ZwBGLmM99pn_UzPo32bpjxocPlM8d40zn4MDikAqPilc97c307ki98Z2-zspGhFfzA=w300` (image/jpeg, 43883 bytes, 300x435) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
