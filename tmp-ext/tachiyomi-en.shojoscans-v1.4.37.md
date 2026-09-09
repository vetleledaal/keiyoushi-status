# Extension Validation Report

- Extension: tachiyomi-en.shojoscans-v1.4.37
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9079184529211162476
- Source name: Violet Scans
- Source language: en
- Selected manga input: popular offset 0: I’ll Be The Matriarch In This Life (`.../ill-be-the-matriarch-in-this-life`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | I’ll Be The Matriarch In This Life (`.../ill-be-the-matriarch-in-this-life`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | A Saint Who Was Adopted by the Grand Duke (`.../a-saint-who-was-adopted-by-the-grand-duke`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | The Extra Wants to Escape From the Obsessive Male Lead (`.../the-extra-wants-to-escape-from-the-obsessive-male-lead`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | I Don’t Mind Being the Hated Empress! (`.../i-dont-mind-being-the-hated-empress`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | I’ll Be The Matriarch In This Life (`.../ill-be-the-matriarch-in-this-life`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | I’ll Be The Matriarch In This Life (`.../ill-be-the-matriarch-in-this-life`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 252 | Chapter 0 (`.../ill-be-the-matriarch-in-this-life-chapter-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I’ll Be The Matriarch In This Life, URL=`.../ill-be-the-matriarch-in-this-life` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://violetscans.org/.../2026-07-19-01-46-45-1784468805675-225x300.png` (image/png, 137541 bytes, 225x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ill-be-the-matriarch-in-this-life` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://violetscans.org/.../2026-07-19-01-46-45-1784468805675.png` (image/png, 2863607 bytes, 1086x1448) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Historical, Shoujo, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Read manhwa I’ll Be the Matriarch in This Life / I Shall Master This Family / I Will Become the Mistress of This Life / Ibeon Saengeun Gajuga Doegetseumnida / In This Life, I Will Be Lord / In This Life, I Will Be the Lord / In This Life, I’ll Become the Head of the Family / В этой жизни я – глава семьи / На сей раз я – хозяйка этой жизни / Я стану хозяйкой этой жизни / 今生我会成为家主 / 이번 생은 가주가 되겠습니다 Florentia was reincarnated as the illegitimate child of the richest family in the empire. She had thought that everything would go well in the future. But her father had passed away, her relatives left her at the doorsteps, and the honourable family she was so proud of was completely ruined…. But is this real? She drank a little (a lot) and was hit by a carriage, When she opened her eyes again, she was seven years old? Moreover, the Second Prince, who was the enemy of her family in her previous life is following her around like a dog!<br><br>Alternative Names:<br>- En cette vie<br>- je deviendrai la cheffe de famille<br>- I Will Become the Mistress of This Life<br>- Ibeonsaeng-eun Gajuga Doegessseubnida<br>- In This Life<br>- I Will Be Lord<br>- In This Life<br>- I Will Be the Lord<br>- In This Life<br>- I'll Become the Head of the Family<br>- Nesta vida<br>- eu serei a matriarca<br>- В этой жизни я - глава семьи<br>- На сей раз я - хозяйка этой жизни<br>- Я стану хозяйкой этой жизни<br>- 이번 생은 가주가 되겠습니다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 252 chapters |  |  |  |
| chapter dates | PASS | 252 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://violetscans.org/.../1.jpg` (image/jpeg, 725552 bytes, 720x8100) |  |  |  |
