# Extension Validation Report

- Extension: tachiyomi-all.kiutaku-v1.4.6
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
- Source ID: 3040035304874076216
- Source name: Kiutaku
- Source language: all
- Selected manga input: popular offset 0: Umeko J - Pomni - Mitaku (`.../7263`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Umeko J - Pomni - Mitaku (`.../7263`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Saizneko - Ubel - Mitaku (`.../7246`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Umeko J - Pomni - Mitaku (`.../7263`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Plathong - Cipher (Honkai: Star Rail) - Mitaku (`.../7243`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Umeko J - Pomni - Mitaku (`.../7263`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Umeko J - Pomni - Mitaku (`.../7263`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 9 | Page 1 (`.../7263`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Umeko J - Pomni - Mitaku, URL=`.../7263` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mitaku.net/.../Umeko-J.-Pomni-Cover.jpg` (image/jpeg, 319208 bytes, 800x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../7263` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Umeko J, Pomni, The Amazing Digital Circus |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | LINT | All 9 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=9 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mitaku.net/.../Umeko-J-Pomni-1.jpg` (image/jpeg, 303873 bytes, 1024x768) |  |  |  |
