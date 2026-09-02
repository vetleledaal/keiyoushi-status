# Extension Validation Report

- Extension: tachiyomi-all.nhentaixxx-v1.6.11
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 1759845183972082995
- Source name: NHentai.xxx
- Source language: en
- Selected manga input: popular offset 0: [Jairou] Shounen ga Otona ni Natta Natsu [English] [Decensored] (`.../498213`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | [Jairou] Shounen ga Otona ni Natta Natsu [English] [Decensored] (`.../498213`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | [MOSQUITONE. (Great Mosu)] My Bully Turned Into a Girl [English] [Decensored] [Digital] (`.../520025`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | [Ebi Hoppe (Galvalume Kouhan)] Kuro Gal no Ongaeshi -Shachiku Oji ga Kasshoku Kyonyuu Gal o Nanpa kara Tasuketara Icha Love Junai Koubi shita Hanashi- [Digital] [English] [duaduapertujuh] (`.../694308`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | [Umamusuko] Lana's Mom Is a Nurse + a (Pokémon) [English, Japanese] (`.../694228`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Jairou] Shounen ga Otona ni Natta Natsu [English] [Decensored] (`.../498213`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../498213`) |  | <1s |
| pages | `getPageList(chapter)` | success | 199 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=\[Umamusuko\] Lana's Mom Is a Nurse + a (Pokémon) \[English, Japanese\], URL=`.../694228` at page 1 offset 21 and page 2 offset 0, title=\[Umamusuko\] Alola Nurse Outfit (Pokémon) \[English, Japanese\], URL=`.../694227` at page 1 offset 22 and page 2 offset 1, title=\[馬ムスコ\] リーリエとルザミーネのプール (ポケットモンスター), URL=`.../694226` at page 1 offset 23 and page 2 offset 2, title=\[Umamusuko\] The Uzaki Family Dance (Uzaki-chan wa Asobitai!) \[English, Japanese\], URL=`.../694225` at page 1 offset 24 and page 2 offset 3 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.nhentaimg.com/.../thumb.jpg` (image/jpeg, 44568 bytes, 250x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../498213` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.nhentaimg.com/.../cover.jpg` (image/jpeg, 77383 bytes, 350x506) |  |  |  |
| details author | PASS | jairou, xil |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big breasts, double vaginal, exhibitionism, ffm threesome, filming, glasses, group, harem, incest, lolicon, mmf threesome, nakadashi, netorare, rough translation, shotacon, sister, story arc, tankoubon, uncensored |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Languages**: english, translated<br><br>**Category**: doujinshi<br><br>**Pages**: 199<br><br>**Alternative title**: 少年が大人になった夏 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 199 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i2.nhentai.xxx/.../1.jpg` (image/jpeg, 332013 bytes, 1280x1850) |  |  |  |
