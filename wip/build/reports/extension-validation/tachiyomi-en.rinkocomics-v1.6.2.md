# Extension Validation Report

- Extension: tachiyomi-en.rinkocomics-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4915548839286527736
- Source name: Rinko Comics
- Source language: en
- Selected manga input: popular offset 0: Reforming the Villain Family (`.../reforming-the-villain-family`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Reforming the Villain Family (`.../reforming-the-villain-family`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | The Princess Maid (`.../the-princess-maid`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Frost (`.../frost`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Reforming the Villain Family (`.../reforming-the-villain-family`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Reforming the Villain Family (`.../reforming-the-villain-family`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 12 | Chapter 1 (`.../reforming-the-villain-family-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 26 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Reforming the Villain Family, URL=`.../reforming-the-villain-family` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rinkocomics.com/.../f9cb8bec-700d-4cf8-a027-2ecea43b0e07-205x300.webp` (image/webp (encoding: lossy), 18914 bytes, 205x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../reforming-the-villain-family` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://rinkocomics.com/.../f9cb8bec-700d-4cf8-a027-2ecea43b0e07-700x1024.webp` (image/webp (encoding: lossy), 108990 bytes, 700x1024) |  |  |  |
| details author | PASS | Unknown Author |  |  |  |
| details artist | PASS | Manhwa |  |  |  |
| details genres | PASS | Drama, Fantasy, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “I have come to find the Duke’s biological daughter.” At the age of 4, I unintentionally became an accomplice in the scam of the villainous Duke from a novel I read in my past life. But why does a normal person like me have to be involved with this villainous duke’s family? To survive the annihilation of the family, I must reform them before they fully turn into villains! “As expected, no matter where we go, my daughter shines the brightest.” “If you don’t want to go, then don’t. Just ignore the Emperor or the Crown Prince.” “So, who confessed? Just tell me their name.” “What?! Which bastard dared to confess to my little girl?!” But wait… As long as they aren’t villains, why are they acting so ridiculously overprotective? “I told you.” I only stopped walking when I was cornered. The footsteps following me stopped too, and a resentful voice echoed in my ears. “You said you’d stay by my side.” His eyes persistently locked onto mine. Honestly, I felt wronged. After all, back then, ‘I didn’t know you were the male lead!’ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.rinkocomics.com/.../01__4b8c8f3e-0169-4a04-9bd1-839b1b7cffd3.webp` (image/webp (encoding: lossy), 724898 bytes, 800x7125) |  |  |  |
