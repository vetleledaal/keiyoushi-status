# Extension Validation Report

- Extension: tachiyomi-en.kaliscansorg-v1.6.1
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
- Source ID: 1879005209022234038
- Source name: KaliScans.org (unoriginal)
- Source language: en
- Selected manga input: popular offset 0: Tales Of Demons And Gods (`.../tales-of-demons-and-gods`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Tales Of Demons And Gods (`.../tales-of-demons-and-gods`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 36 | Can’t Think Straight (`.../cant-think-straight`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 36 | My Path Is To Become A Developer (`.../my-path-is-to-become-a-developer`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | Yamagami-sama to Okiniiri (`.../yamagami-sama-to-okiniiri`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tales Of Demons And Gods (`.../tales-of-demons-and-gods`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tales Of Demons And Gods (`.../tales-of-demons-and-gods`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1298 | Chapter 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tales Of Demons And Gods, URL=`tales-of-demons-and-gods` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.zonatmo.org/.../7536798794366fe6871c22198c38b726.jpg` (image/jpeg, 37882 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `tales-of-demons-and-gods` |  |  |  |
| details thumbnail URL | PASS | `https://storage.zonatmo.org/.../7536798794366fe6871c22198c38b726.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Drama, Action, Fantasy, Comedy, Adventure, Harem, Manhua, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | **Views:** 3.8k<br><br>Nie Li, one of the strongest Demon Spiritist in his past life standing at the pinnacle of the martial world , however he lost his life during the battle with Sage Emperor and the six deity ranked beast, his soul was then reborn back in time back to when he is still 13. Although he’s the weakest in his class with the lowest talent at only Red soul realm, with the aid of the vast knowledge which he accumulated in his previous life, he trained faster then anyone. Trying to protect the city which in the coming future was being assaulted by beast and ended up being destroyed as well as protecting his lover, friends and family who died by the beast assault. and to destroy the Sacred family whom abandon their duty and betrayed the city in his past life. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1298 chapters |  |  |  |
| chapter dates | PASS | 1298 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage.zonatmo.org/.../96a8b05125ae0c5a9f369bfe5c6055d5.jpg` (image/jpeg, 101490 bytes, 700x991) |  |  |  |
