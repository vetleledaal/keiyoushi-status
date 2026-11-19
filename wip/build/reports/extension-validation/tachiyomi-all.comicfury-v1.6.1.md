# Extension Validation Report

- Extension: tachiyomi-all.comicfury-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.g
- Source ID: 6251704791239468278
- Source name: Comic Fury
- Source language: en
- Selected manga input: latest offset 0: Ask Pokeball Plunderers (`.../comicprofile.php <redacted query values: url>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Golden Shrike (`.../comicprofile.php <redacted query values: url>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Lost Scent (`.../comicprofile.php <redacted query values: url>`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Ask Pokeball Plunderers (`.../comicprofile.php <redacted query values: url>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | M3 Sisters Backstage (`.../comicprofile.php <redacted query values: url>`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 30 | Ask Pokeball Plunderers (`.../comicprofile.php <redacted query values: url>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ask Pokeball Plunderers (`.../comicprofile.php <redacted query values: url>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 42 | Cover + Notes - Cover (`.../2995267`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ask Pokeball Plunderers, URL=`.../comicprofile.php <redacted query values: url>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://comicfury.com/.../default-avatar-dark.svg` -> 2 manga URLs (examples: `.../comicprofile.php <redacted query values: url>`, `.../comicprofile.php <redacted query values: url>`) |  |  |  |
| thumbnail | PASS | `https://comicfury.com/.../89907_1786712799b110644c400d400f2127154863.webp` (image/webp (container: extended), 16190 bytes, 400x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../comicprofile.php <redacted query values: url>` |  |  |  |
| details thumbnail URL | PASS | `https://comicfury.com/.../89907_1786712799b110644c400d400f2127154863.webp` |  |  |  |
| details author | PASS | SourdoughsBreadPan |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Romance, Adventure, Pokémon, Choose Your Own Adventure |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | You are given a Pokemon body and dropped into a world where a war has just ended. What will you do with your newfound freedom? \[Set in the same universe as Ask Impatient Samurott.\] |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 42 chapters |  |  |  |
| chapter dates | PASS | 42 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.comicfury.com/.../89907a1787760972b110644f79895098.png` (image/png, 106968 bytes, 710x374) |  |  |  |
