# Extension Validation Report

- Extension: tachiyomi-it.ddtteam-v1.6.6
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 25
- Lint: 3
- Warnings: 1
- Skipped: 4
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4975929166626394514
- Source name: DDT Team
- Source language: it
- Selected manga input: popular offset 0: 1 or W (`.../1_or_w`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 324 | 1 or W (`.../1_or_w`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | After school adventure (`.../after_school_adventure`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 1 or W (`.../1_or_w`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Vol.1 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 264 |  |  | 1-10s |

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
| popular listing | PASS | 324 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 334/334 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 334/334 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://ddt.hastateam.com/.../hasta_logo_red_rect.png` -> 2 manga URLs (examples: `.../brynhildr_nelloscurit`, `.../nobilt_contadina`) |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://ddt.hastateam.com/.../1-or-W---000-Cover.jpg <redacted query values: v>` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../1_or_w` |  |  |  |
| details thumbnail URL | PASS | `https://ddt.hastateam.com/.../1-or-W---000-Cover.jpg <redacted query values: v>` |  |  |  |
| details author | PASS | Rumiko Takahashi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Tratto da MangaDB<br><br>Raccolta di storie prevalentemente umoristico/sentimentali che ben rappresentano lo spirito dell'autrice.<br>Le storie riportate non sono relative allo stesso periodo: la più vecchia risale al 1978 mentre la più attuale al 1993.<br>Il titolo del volume si riferisce ad un episodio interno e si legge "One or double"  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 264 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://ddt.hastateam.com/.../1_or_w__000_cover.jpg <redacted query values: v>` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
