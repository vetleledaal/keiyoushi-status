# Extension Validation Report

- Extension: tachiyomi-en.webtoonlib-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2442596821296482388
- Source name: WebtoonLib
- Source language: en
- Selected manga input: popular offset 0: Minmotion Syndrome (`.../minmotion-syndrome-4f13d1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Minmotion Syndrome (`.../minmotion-syndrome-4f13d1`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Love Advice from the Great Duke of Hell (`.../love-advice-from-the-great-duke-of-hell-33386a`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Hong Eun-Young's Egyptian Mythology (`.../hong-eun-young-s-egyptian-mythology-2bm6o3pa`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Clover Days (`.../clover-days-eirfrwt5`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Minmotion Syndrome (`.../minmotion-syndrome-4f13d1`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 94 | Chapter 1 (`.../1-4x5wde`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 160/160 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 160/160 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.webtoonlib.to/.../cover.avif` (image/avif (format: avif), 76534 bytes, 600x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `minmotion-syndrome-4f13d1` |  |  |  |
| details thumbnail URL | PASS | `https://img.webtoonlib.to/.../cover.avif` |  |  |  |
| details author | PASS | Niji |  |  |  |
| details artist | PASS | niji |  |  |  |
| details genres | PASS | Manhwa, Mature, Drama, Slice of Life, Fantasy, Romance, Yaoi, Smut, Adult, Yakuza, Omegaverse |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★ 9.0 · bomtoon<br><br>In a world defined by secondary genders, Seo Taeyoon is an Alpha who has hit rock bottom. Left with a crippling debt of 450 million won by his deceased father, he is cornered by the loan shark holding his life in the balance: Park Jae-in. Jae-in is not just any creditor; he is a cold-blooded mob boss who rules the underground with an iron fist. However, Jae-in hides a biological secret that defies the laws of their world. He is an Omega affected by 'Minmotion Syndrome,' a rare condition that suppresses his heat and pheromones, allowing him to pass undetected among Alphas and Betas.<br><br>The status quo shatters when Taeyoon instinctively reacts to Jae-in's scent—a scent that shouldn't exist to anyone else. Intrigued and unsettled by the one Alpha who can see through his mask, Jae-in proposes a sinister deal: he will absolve Taeyoon's financial debt in exchange for total ownership of his body and life. What begins as a desperate contract for survival quickly evolves into a complex game of dominance and desire.<br><br>Minmotion Syndrome offers a compelling subversion of traditional Omegaverse tropes, featuring a powerful, dominant Omega and a indebted Alpha forced into submission. As Taeyoon navigates his new life as Jae-in's 'slave,' the biological pull between them grows impossible to ignore. Readers can expect a story filled with high-stakes tension, psychological mind games, and a steamy, turbulent romance that questions who truly holds the power.<br><br>**Alternative titles:** 민모션<br><br>**Links:**<br>- \[MyAnimeList\](https://myanimelist.net/.../185210) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 94 chapters |  |  |  |
| chapter dates | PASS | 94 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
