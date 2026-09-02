# Extension Validation Report

- Extension: tachiyomi-ja.idolgravureprincessdate-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5414342435310010512
- Source name: Idol. gravureprincess .date
- Source language: ja
- Selected manga input: popular offset 0: Tanaka Miku 田中美久, Young Champion 2024 No.14 (ヤングチャンピオン 2024年14号)  (`.../tanaka-miku-young-champion-2024-no14.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 25 | Tanaka Miku 田中美久, Young Champion 2024 No.14 (ヤングチャンピオン 2024年14号)  (`.../tanaka-miku-young-champion-2024-no14.html`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 25 | Risako 凛咲子, FRIDAY 2024.07.12 (フライデー 2024年7月12日号) (`.../risako-friday-20240712-2024712.html`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Tanaka Miku 田中美久, Young Champion 2024 No.14 (ヤングチャンピオン 2024年14号)  (`.../tanaka-miku-young-champion-2024-no14.html`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Tanaka Miku 田中美久, Young Champion 2024 No.14 (ヤングチャンピオン 2024年14号)  (`.../tanaka-miku-young-champion-2024-no14.html`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../tanaka-miku-young-champion-2024-no14.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tanaka Miku 田中美久, Young Champion 2024 No.14 (ヤングチャンピオン 2024年14号) , URL=`.../tanaka-miku-young-champion-2024-no14.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../CAMP14MIKU_0.webp` (image/jpeg, 78178 bytes, 500x750) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tanaka-miku-young-champion-2024-no14.html` |  |  |  |
| details thumbnail URL | PASS | `https://blogger.googleusercontent.com/.../CAMP14MIKU_0.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Tanaka Miku 田中美久, Young Champion |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | LINT | Untrimmed fields: title |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../CAMP14MIKU_0.webp` (image/jpeg, 78178 bytes, 500x750) |  |  |  |
