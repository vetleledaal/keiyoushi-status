# Extension Validation Report

- Extension: tachiyomi-th.slowmanga-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 3
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3894617311216312574
- Source name: Slow Manga
- Source language: th
- Selected manga input: latest offset 0: Face Genius : 0-Year-Old Top Star (`.../face-genius-0-year-old-top-star`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | I Took over The Academy With a Single Sashimi Knife (`.../i-took-over-the-academy-with-a-single-sashimi-knife`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Cosmic Heavenly Demon 3077 (`.../cosmic-heavenly-demon-3077`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Face Genius : 0-Year-Old Top Star (`.../face-genius-0-year-old-top-star`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Revenge of the sword clan’s hound (`.../revenge-of-the-sword-clans-hound`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Face Genius : 0-Year-Old Top Star (`.../face-genius-0-year-old-top-star`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Face Genius : 0-Year-Old Top Star (`.../face-genius-0-year-old-top-star`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 61 | ตอนที่ 1 (`.../face-genius-0-year-old-top-star-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Face Genius : 0-Year-Old Top Star, URL=`.../face-genius-0-year-old-top-star` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.slow-manga.net/.../images-1.jpg` (image/jpeg, 10994 bytes, 188x269) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../face-genius-0-year-old-top-star` |  |  |  |
| details thumbnail URL | PASS | `https://www.slow-manga.net/.../images-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Manhwa, โรแมนติก |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 61 chapters |  |  |  |
| chapter dates | LINT | All 61 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=61 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img3.flash-manga.com/.../68c008b7090c0PThLb.jpg` (image/jpeg, 1148196 bytes, 760x9000) |  |  |  |
