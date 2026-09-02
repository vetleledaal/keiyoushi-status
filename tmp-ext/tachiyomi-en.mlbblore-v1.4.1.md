# Extension Validation Report

- Extension: tachiyomi-en.mlbblore-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1211137741907860722
- Source name: MLBB Lore Comics
- Source language: en
- Selected manga input: popular offset 0: Visitors from Cybertron (`.../98`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 5 | Visitors from Cybertron (`.../98`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 5 | Shades of Secrets (`.../119`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 5 | MLBB Rank Party Comic Special (`.../294`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 5 | Ruby's Comic (`.../272`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 5 | Visitors from Cybertron (`.../98`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Visitors from Cybertron (`.../98`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../98`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 5 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Visitors from Cybertron, URL=`98` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 25/25 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 25/25 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://akmweb.youngjoygame.com/.../6484f9b29e717f08fa863f1d55a1e0de.jpg <redacted query values: w>` (image/jpeg, 189396 bytes, 690x388) |  |  |  |
| details identity | PASS | Details preserved selected URL `98` |  |  |  |
| details thumbnail URL | PASS | `https://akmweb.youngjoygame.com/.../6484f9b29e717f08fa863f1d55a1e0de.jpg <redacted query values: w>` |  |  |  |
| details author | PASS | Transformers |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Want more MLBB hero lore, teasers, and comics? Tap the portal below to check more on the official lore site, Legends of Dawn! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://akmweb.youngjoygame.com/.../1ffd030b890a0a99b51896e1754fe92c.jpg <redacted query values: w>` (image/jpeg, 241524 bytes, 1000x3434) |  |  |  |
