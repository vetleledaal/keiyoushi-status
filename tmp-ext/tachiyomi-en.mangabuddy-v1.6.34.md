# Extension Validation Report

- Extension: tachiyomi-en.mangabuddy-v1.6.34
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangak
- Source ID: 5020395055978987501
- Source name: MangaK
- Source language: en
- Selected manga input: popular offset 0: Shutline (`.../shutline`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Shutline (`.../shutline`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Dog and Bird (`.../dog-and-bird`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Shinkon Gokko (`.../shinkon-gokko`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Ochibure Shinshi ni Ai no Uta (`.../ochibure-shinshi-ni-ai-no-uta`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Shutline (`.../shutline`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Shutline (`.../shutline`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 191 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 4 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shutline, URL=`.../shutline` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rx.resmk.org/.../2df477b225b7.webp` (image/webp (encoding: lossy), 10054 bytes, 200x267) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shutline` |  |  |  |
| details thumbnail URL | PASS | `https://rx.resmk.org/.../2df477b225b7.webp` |  |  |  |
| details author | PASS | Kyou (II), Kyo Woo, Kyou. |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, Boys Love, Romance, Adult, Mature, Smut, Yaoi, Webtoon, Webtoons, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Shin is barely making ends meet, hustling as a rogue mechanic on the mean city streets. Problem is, work never comes easy and the dough is nothing to shout about. But when Jake pulls up with car trouble one day, it’s obvious that there’s money to be made: he’s tall, blond and dressed like a million bucks. Jackpot. And after such a handsome payday, Shin is reluctant to let this sucker go. Little does he know that giving Jake his number may be the biggest mistake he’s ever made. And it isn’t long before Jake wants more than his car fixing… *(Source: Lezhin)*<br><br>\[Original Webtoon\](https://www.lezhin.com/.../shutline)  <br>**Audio Drama:** \[Vimeo\](https://vimeo.com/.../831768504)<br><br>**Official Translations:**  <br>\[English\](https://www.lezhinus.com/.../shutline_en), \[Thai\](https://www.boomtoon.com/.../shutline), \[French\](https://www.lezhinfr.com/.../bt_1110152), \[German\](https://www.lezhinde.com/.../dbd_00341), \[T.Chinese\](https://www.bomtoon.tw/.../shutline)  <br>Japanese: \[Beltoon\](https://www.beltoon.jp/.../shutline), \[Lezhin\](https://www.lezhin.jp/.../shutline)  <br>Spanish: \[Censored\](https://www.lezhin.es/.../shutline-sin-censura), \[Uncensored\](https://www.lezhin.es/.../shutline)  <br>Print: \[German\](https://altraverse.de/.../shutline), Italian, Thai <br><br>***Note:**  <br>-The German print version from Altraverse, the Italian edition, and the Thai edition are completely uncensored.  <br>-The T.Chinese, English, French, and Spanish versions will become \[uncensored\](https://twitter.com/.../1760175354185142323 <redacted query values: s>). It will be serialized uncensored from S3 onwards.* |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 54 name, chapter 105 name, chapter 190 name |  |  |  |
| chapters | PASS | 191 chapters |  |  |  |
| chapter dates | PASS | 191 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rx.qvzrg.org/.../bb7346f8d9d5.webp` (image/webp (encoding: lossy), 105140 bytes, 1200x2400) |  |  |  |
