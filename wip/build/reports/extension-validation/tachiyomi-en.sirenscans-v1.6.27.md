# Extension Validation Report

- Extension: tachiyomi-en.sirenscans-v1.6.27
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: keyoapp
- Source ID: 5804710058654490234
- Source name: Siren Scans
- Source language: en
- Selected manga input: popular offset 0: Why You Don't Know It's a Girl? (`.../why-you-don-t-know-it-s-a-girl`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | Why You Don't Know It's a Girl? (`.../why-you-don-t-know-it-s-a-girl`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | How I Met My Soulmate (`.../how-i-met-my-soulmate`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | After Rebirth, I Married My Scumbag Ex's Arch-Enemy (`.../after-rebirth-i-married-my-scumbag-ex-s-arch-enemy`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | The three shall come (`.../the-three-shall-come`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 8 | Why You Don't Know It's a Girl? (`.../why-you-don-t-know-it-s-a-girl`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Why You Don't Know It's a Girl? (`.../why-you-don-t-know-it-s-a-girl`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 53 | chapter 00 (`.../why-you-don-t-know-it-s-a-girl-chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 3 |  |  | 1-10s |

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
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Why You Don't Know It's a Girl?, URL=`.../why-you-don-t-know-it-s-a-girl` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 71/71 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 71/71 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wsrv.nl <redacted query values: url>` (image/jpeg, 35889 bytes, 384x512) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../why-you-don-t-know-it-s-a-girl` |  |  |  |
| details thumbnail URL | PASS | `https://wsrv.nl <redacted query values: url>` |  |  |  |
| details author | PASS | Lee Ahyeon ,Ryu Doha |  |  |  |
| details artist | PASS | One Punch Rabbit |  |  |  |
| details genres | PASS | Mystery, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kang Jae-hee, a former special unit called a human weapon alive with superior power and combat skills than a man. Now, after being discharged from the military, she became a police officer in the Republic of Korea. To Jae-hee, who was working hard today to realize the justice of the Republic of Korea, A huge mission is given one day. It's none other than the second generation of chaebols of Samgang Group, Korea's leading company, Become the secretary of director Yoon Yi-joon, a suspect in the murder of a female secretary, to reveal his sins! However, the role of Sangtorai Yoon Yi-jun's secretary among Sangtorai For Jaehee, it was scarier than war, compatibility, and Mama. Besides... “Secretary Kim, this may sound sad, but I came to like Secretary Kim!“ Even the urgent confession?! "Excuse me..." But... I'm a man now...😕? Ununderstandable retaking is an unimaginable romantic comedy between a four-dimensional man and a girl crush iron wall girl!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 53 chapters |  |  |  |
| chapter dates | PASS | 53 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../DeGxQ-LowE7` (image/jpeg, 954219 bytes, 800x16666; server Content-Type: text/plain) |  |  |  |
