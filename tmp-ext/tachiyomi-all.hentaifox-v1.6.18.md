# Extension Validation Report

- Extension: tachiyomi-all.hentaifox-v1.6.18
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: galleryadults
- Source ID: 7945033982379409892
- Source name: HentaiFox
- Source language: en
- Selected manga input: popular offset 0: Ane to no Nichijō Kaiwa | Everyday Conversations With My Big Sister (`.../121051`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Ane to no Nichijō Kaiwa | Everyday Conversations With My Big Sister (`.../121051`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Goukaku Iwai no Fudeoroshi Koubi de Kintama Karappo ni Shite Kureru Bakunyuu Gishi | My Big-Breasted Stepsister Let Me Have My First Time With Her Until My Balls Were Empty as a Reward for Passing My Entrance Exams (`.../101281`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Mi Da Ra (`.../172585`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | If We Kiss, We'll Have a Baby! ~The Sanpaku-Eyed Delinquent Slut Who's Actually a Tall Girl with Zero Sex Knowledge, and Me, the Disciplinary Committee Member Who's Desperately Trying To Suppress His Insane Libido~ (`.../172577`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ane to no Nichijō Kaiwa | Everyday Conversations With My Big Sister (`.../121051`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../121051`) |  | <1s |
| pages | `getPageList(chapter)` | success | 137 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=If We Kiss, We'll Have a Baby! ~The Sanpaku-Eyed Delinquent Slut Who's Actually a Tall Girl with Zero Sex Knowledge, and Me, the Disciplinary Committee Member Who's Desperately Trying To Suppress His Insane Libido~, URL=`.../172577` at page 1 offset 8 and page 2 offset 0, title=No one's attaining any enlightment with those huge boobs around, URL=`.../172576` at page 1 offset 9 and page 2 offset 1, title=Musashi's Lewd Book 2, URL=`.../172575` at page 1 offset 10 and page 2 offset 2, title=Father saw all of it!!, URL=`.../172574` at page 1 offset 11 and page 2 offset 3, title=Kawaii Sukeyru, URL=`.../172573` at page 1 offset 12 and page 2 offset 4, title=Kasou Douwa wa Kiken ga Ippai!? Yumemi Gachi na Shoujo Hen 2, URL=`.../172572` at page 1 offset 13 and page 2 offset 5, title=Masaka Ano Oni Joushi ga Ore no SeFri ni Naru nante 3 ~Joushi to Himitsu no Amaama Noumitsu Dousei Seikatsu~ \| I never thought that diabolical boss would become my sex friend 3, URL=`.../172571` at page 1 offset 14 and page 2 offset 6, title=日焼けスペシャル：水着での日焼け, URL=`.../172570` at page 1 offset 15 and page 2 offset 7, title=Maso Chiryou Android kara Nigerarenai Junbigou \| You Can't Escape from the Masochist Treatment Android: Preparatory Issue, URL=`.../172569` at page 1 offset 16 and page 2 offset 8, title=Hiyake tokushū Tan# 3, URL=`.../172568` at page 1 offset 17 and page 2 offset 9, title=Minase Suzuka no Hinichijou, URL=`.../172567` at page 1 offset 18 and page 2 offset 10, title=Remie, URL=`.../172566` at page 1 offset 19 and page 2 offset 11 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.hentaifox.com/.../thumb.jpg` (image/jpeg, 33864 bytes, 250x337) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../121051` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.hentaifox.com/.../cover.jpg` (image/jpeg, 57376 bytes, 350x472) |  |  |  |
| details author | PASS | hanpatsu zokusei, mejikara scene |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big breasts, brother, first person perspective, footjob, incest, mosaic censorship, nakadashi, paizuri, sister, sole female, sumata |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Parodies**: original<br><br>**Languages**: english, translated<br><br>**Categories**: doujinshi<br><br>**Pages**: 137 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 137 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i2.hentaifox.com/.../1.jpg` (image/jpeg, 215760 bytes, 1280x1728) |  |  |  |
