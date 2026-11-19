# Extension Validation Report

- Extension: tachiyomi-en.manhwaxxl-v1.6.2
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
- Source implementation: keiyoushi.source.Generated
- Source ID: 1823408414151467671
- Source name: HentaiTnT
- Source language: en
- Selected manga input: popular offset 0: Yogurt Delivery Lady (`.../yogurt-delivery-lady.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Yogurt Delivery Lady (`.../yogurt-delivery-lady.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Welcome To The Adult Entertainment Complex: Nonstop Harem Sex After 2 Am! (Uncensored) (`.../welcome-to-the-adult-entertainment-complex-nonstop-harem-sex-after-2-am-uncensored.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Secret Siblings (Uncensored) (`.../secret-siblings-uncensored.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Hole 2 My Goal (Uncensored) (`.../hole-2-my-goal-uncensored.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Yogurt Delivery Lady (`.../yogurt-delivery-lady.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Yogurt Delivery Lady (`.../yogurt-delivery-lady.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 85 | Chapter 1 (`.../chapter-1.html`) |  | 1-10s |
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
| popular pagination | UNUSUAL | Overlapping manga: title=Welcome To The Adult Entertainment Complex: Nonstop Harem Sex After 2 Am! (Uncensored), URL=`.../welcome-to-the-adult-entertainment-complex-nonstop-harem-sex-after-2-am-uncensored.html` at page 1 offset 23 and page 2 offset 0 |  |  |  |
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
