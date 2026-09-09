# Extension Validation Report

- Extension: tachiyomi-en.manhwaxxl-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1823408414151467671
- Source name: HentaiTnT
- Source language: en
- Selected manga input: popular offset 0: Yogurt Delivery Lady (`.../yogurt-delivery-lady.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Yogurt Delivery Lady (`.../yogurt-delivery-lady.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Futanari Tisshu Kubari Arubaito (`.../futanari-tisshu-kubari-arubaito.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Haha To Ochite Iku Part 1 (`.../haha-to-ochite-iku-part-1.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Someone Stop Her! (Uncensored) (`.../someone-stop-her-uncensored.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Yogurt Delivery Lady (`.../yogurt-delivery-lady.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Yogurt Delivery Lady (`.../yogurt-delivery-lady.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 85 | Chapter 1 (`.../chapter-1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yogurt Delivery Lady, URL=`.../yogurt-delivery-lady.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Futanari Tisshu Kubari Arubaito, URL=`.../futanari-tisshu-kubari-arubaito.html` at page 1 offset 22 and page 2 offset 0 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.hentaitnt.net/.../yogurt-delivery-lady.webp` (image/webp (encoding: lossy), 12636 bytes, 214x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yogurt-delivery-lady.html` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | TTwook |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Mature, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Rumor has it, that there’s a yogurt lady who eats men’s yogurt in a one-bedroom village at a university. To verify the rumor, Junwoo asks Sohee, the yogurt lady he secretly likes. “Ahjumma, I wanna eat Junwoo’s yogurt.” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 85 chapters |  |  |  |
| chapter dates | LINT | All 85 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=85 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn3.tymanga.com/.../1-872d3.jpg` (image/jpeg, 1305807 bytes, 634x13002) |  |  |  |
