# Extension Validation Report

- Extension: tachiyomi-all.leagueoflegends-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5421383187922044761
- Source name: League of Legends
- Source language: en
- Selected manga input: popular offset 0: Star-Crossed (`.../star-guardian`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 13 | Star-Crossed (`.../star-guardian`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Star-Crossed (`.../star-guardian`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Star-Crossed (`.../star-guardian`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 5 | Convince Me (`.../issue-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | <1s |

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
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Star-Crossed, URL=`star-guardian` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 14/14 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 14/14 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cmsassets.rgpub.io/.../69b5536c4179110d477bac6676dd808df79d42a1-2400x1320.jpg <redacted query values: accountingTag>` (image/jpeg, 525596 bytes, 2400x1320) |  |  |  |
| details identity | PASS | Details preserved selected URL `star-guardian` |  |  |  |
| details thumbnail URL | PASS | `https://cmsassets.rgpub.io/.../69b5536c4179110d477bac6676dd808df79d42a1-2400x1320.jpg <redacted query values: accountingTag>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Star Guardian |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | In hopes of saving her true love from darkness, Xayah embarks on a quest across the galaxy to recruit a new team of Star Guardians. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://universe-comics.leagueoflegends.com/.../star-guardian-01-en_us_001-full.jpg <redacted query values: v>` (image/jpeg, 3516538 bytes, 1920x13990) |  |  |  |
