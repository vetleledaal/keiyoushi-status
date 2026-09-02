# Extension Validation Report

- Extension: tachiyomi-en.darkscience-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 26
- Lint: 0
- Warnings: 0
- Skipped: 10
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2059482759352416637
- Source name: Dark Science
- Source language: en
- Selected manga input: popular offset 0: Dark Science (`.../darkscience`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 1 | Dark Science (`.../darkscience`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.UnsupportedOperationException | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Dark Science (`.../darkscience`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 195 | Dark Science #01 – The Collected Works of Shakespeare: the ... (`.../dark-science-01`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | SKIP | java.lang.UnsupportedOperationException |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | search operation did not complete successfully |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 1/1 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1/1 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dresdencodak.com/.../DC_CastIcon_Kimiko.png` (image/png, 112001 bytes, 300x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../darkscience` |  |  |  |
| details thumbnail URL | PASS | `https://dresdencodak.com/.../DC_CastIcon_Kimiko.png` |  |  |  |
| details author | PASS | Sen (A. Senna Diaz) |  |  |  |
| details artist | PASS | Sen (A. Senna Diaz) |  |  |  |
| details genres | PASS | Science Fiction, Mystery, LGBT+ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Scientist Kimiko Ross has a problem:<br> her money’s gone and a bank exploded her house. With no place<br> else to go, she travels to Nephilopolis, the city of giants –<br> built from the ruins of an ancient war and a fading memory of<br> tomorrow.\n Follow our cyborg hero as she attempts to survive the<br> bureaucratic behemoth with a little “help” from her “friends.”<br> And what exactly is Dark Science anyway?\nSupport the comic on<br> Patreon: https://www.patreon.com/.../dresdencodak |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 195 chapters |  |  |  |
| chapter dates | PASS | 195 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://dresdencodak.com/.../ds_001.jpg` (image/jpeg, 1877358 bytes, 2500x4265) |  |  |  |
