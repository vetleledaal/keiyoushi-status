# Extension Validation Report

- Extension: tachiyomi-tr.faichisubs-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8160196832207812846
- Source name: FaichiSubs
- Source language: tr
- Selected manga input: popular offset 0: Smoking Behind the Supermarket with You (`.../smoking-behind-the-supermarket-with-you-147149-147149`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 9 | Smoking Behind the Supermarket with You (`.../smoking-behind-the-supermarket-with-you-147149-147149`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Smoking Behind the Supermarket with You (`.../smoking-behind-the-supermarket-with-you-147149-147149`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Smoking Behind the Supermarket with You (`.../smoking-behind-the-supermarket-with-you-147149-147149`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 59 | 1. Bölüm (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Smoking Behind the Supermarket with You, URL=`.../smoking-behind-the-supermarket-with-you-147149-147149` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 10/10 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 10/10 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.anilist.co/.../bx147149-9DQ4upJAV2kQ.jpg` (image/jpeg, 139806 bytes, 460x654) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../smoking-behind-the-supermarket-with-you-147149-147149` |  |  |  |
| details thumbnail URL | PASS | `https://s4.anilist.co/.../bx147149-9DQ4upJAV2kQ.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Romance, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★☆ 81<br><br>Kırk beş yaşındaki ofis çalışanı Sasaki, kurumsal hayatın yıpratıcı temposundan bunalmıştır. Tek tesellisi sigara içmek ve süpermarket kasiyeri Yamada’nın dostça gülümsemesidir. Özellikle zorlu geçen bir günün ardından Yamada’yı yerinde bulamayan Sasaki, etkileyici bir kadının davetiyle onunla birlikte sigara içer. Karamsar adam, havalı ve takılmayı seven Tayama ile yeni bir sigara arkadaşlığı kurduğunu düşünür; ancak aslında onu çoktan tanıdığının farkında değildir!<br><br>**Alternative Names:**<br>- A Story About Smoking at the Back of the Supermarket<br>- スーパーの裏でヤニ吸う話<br>- Super no Ura de Yani Suu Hanashi<br>- Behind the Supermarket Smoking with You<br>- 躲在超市後門抽菸的兩人<br>- Paląc z tobą na tyłach sklepu<br>- Smoking Behind The Supermarket<br>- Fumando juntos detrás del súper<br>- Fumando atrás del súper con vos<br>- Перекур за супермаркетом з тобою<br>- ヤニすう<br>- YaniSuu<br>- Hiên Sau Siêu Thị, Muộn Phiền Bay Đi<br>- 在超市后门吸烟的二人<br>- 슈퍼 뒤에서 담배 피우는 두 사람<br>- スーパーの裏でヤニ吸うふたり<br>- Super no Ura de Yani Suu Futari |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 59 chapters |  |  |  |
| chapter dates | PASS | 59 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://faichisubs.com/.../1785530517343-131177109.jpg` (image/jpeg, 2440264 bytes, 2100x1500) |  |  |  |
