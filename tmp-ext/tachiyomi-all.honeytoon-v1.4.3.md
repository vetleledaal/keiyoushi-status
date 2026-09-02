# Extension Validation Report

- Extension: tachiyomi-all.honeytoon-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 1063521896373496908
- Source name: Honeytoon
- Source language: en
- Selected manga input: latest offset 0: Start with a mountain (`.../start-with-a-mountain`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | Here lies the wicked (`.../here-lies-the-wicked`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 21 | Start with a mountain (`.../start-with-a-mountain`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Start With A Mountain (`.../start-with-a-mountain`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Start With A Mountain (`.../start-with-a-mountain`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 73 | Episode 1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 103 |  |  | 1-10s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Start With A Mountain, URL=`.../start-with-a-mountain` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pic.honeytoon.com/.../52e494e9-d73b-4f1b-a6ed-75534195dedd-1774964565-71.jpg` (image/jpeg, 127403 bytes, 744x1104) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Start with a mountain to Start With A Mountain |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | VV |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, #drama, #fantasy_world |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Start with a Mountain — a young man from a humble village inherits a ruined mountain fortress in a chaotic world. With a Start with a Mountain — a young man from a humble village inherits a ruined mountain fortress in a chaotic world. With a strategist and a groom at his side, he sets out to turn it into a powerful stronghold. Will he become a ruthless bandit king or fight to earn a legendary name? Start with a Mountain — a young man from a humble village inherits a ruined mountain fortress in a chaotic world. With a strategist and a groom at his side, he sets out to turn it into a powerful stronghold. Will he become a ruthless bandit king or fight to earn a legendary name? ... Read more Hide |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 73 chapters |  |  |  |
| chapter dates | PASS | 73 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 103 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://pic.honeytoon.com/.../a44113d4-70ef-4365-9cf4-095bb66fb6b4.webp` (image/webp (container: extended), 59340 bytes, 900x1286) |  |  |  |
