# Extension Validation Report

- Extension: tachiyomi-all.imhentai-v1.6.25
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 1797754663718263026
- Source name: IMHentai
- Source language: en
- Selected manga input: popular offset 0: [Maron ☆ Maron] Gaki ni Modotte Yarinaoshi!!! | Turning Back Into a Kid And Starting Over!!! [English] [friggo+B.E.C. Scans] (`.../386132`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | [Maron ☆ Maron] Gaki ni Modotte Yarinaoshi!!! | Turning Back Into a Kid And Starting Over!!! [English] [friggo+B.E.C. Scans] (`.../386132`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | [Korotsuke] Nekura Megane ♀ | The Creepy Glasses Girl [English] [Ongoing] {darknight} (`.../810930`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | [DoorManMig] Mom & Sis (`.../1730599`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | [Ebi Hoppe (Galvalume Kouhan)] Kuro Gal no Ongaeshi -Shachiku Oji ga Kasshoku Kyonyuu Gal o Nanpa kara Tasuketara Icha Love Junai Koubi shita Hanashi- [Digital] [English] [duaduapertujuh] (`.../1730562`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Maron ☆ Maron] Gaki ni Modotte Yarinaoshi!!! | Turning Back Into a Kid And Starting Over!!! [English] [friggo+B.E.C. Scans] (`.../386132`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../386132`) |  | <1s |
| pages | `getPageList(chapter)` | success | 566 |  |  | <1s |

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
| latest pagination | UNUSUAL | Overlapping manga: title=\[Ebi Hoppe (Galvalume Kouhan)\] Kuro Gal no Ongaeshi -Shachiku Oji ga Kasshoku Kyonyuu Gal o Nanpa kara Tasuketara Icha Love Junai Koubi shita Hanashi- \[Digital\] \[English\] \[duaduapertujuh\], URL=`.../1730562` at page 1 offset 10 and page 2 offset 0, title=Bryce + Yoichi (HD) (Patreon), URL=`.../1730560` at page 1 offset 11 and page 2 offset 1, title=\[Shadman\] Jaiden Animations, URL=`.../1730559` at page 1 offset 12 and page 2 offset 2, title=Artist - YolaBayola1, URL=`.../1730554` at page 1 offset 13 and page 2 offset 3, title=\[Tremhunter\] Subterran Exchange X-team program ( in progress) eng, URL=`.../1730551` at page 1 offset 14 and page 2 offset 4, title=\[Artist\] - Vial - DryVial, URL=`.../1730550` at page 1 offset 15 and page 2 offset 5, title=\[Imsofckinlost\] Maya, Nes, Emily & Aisha (OC), URL=`.../1730548` at page 1 offset 16 and page 2 offset 6, title=\[Ampullaria (ki-51)\] Matsuri to Hamakaze to \| The Festival and Hamakaze (Kantai Collection -KanColle-) \[ENGLISH\] \[Digital\] \[UsualCat\], URL=`.../1730542` at page 1 offset 17 and page 2 offset 7, title=\[CapMarvellous\] Sludge's Revenge (Possession Hub) (English), URL=`.../1730540` at page 1 offset 18 and page 2 offset 8, title=K.F.D. (PIero)\] Suki Suki Lyne-chan (Strike Witches) \[Digital\], URL=`.../1730536` at page 1 offset 19 and page 2 offset 9 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://m2.imhentai.xxx/.../thumb.jpg` (image/jpeg, 31944 bytes, 250x187) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../386132` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://m2.imhentai.xxx/.../cover.jpg` (image/jpeg, 55985 bytes, 350x263) |  |  |  |
| details author | PASS | koto, nise kurosaki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | age progression, age regression, ahegao, anal, apron, beauty mark, big ass, big breasts, big penis, bisexual, bloomers, blowjob, bride, cheating, dark skin, deepthroat, defloration, double penetration, drugs, exhibitionism, ffm threesome, footjob, glasses, group, gyaru, handjob, harem, humiliation, impregnation, incest, lactation, lolicon, milf, mind break, mosaic censorship, nakadashi, oppai loli, oyakodon, pantyhose, pasties, ponytail, pregnant, rape, school swimsuit, schoolboy uniform, schoolgirl uniform, sex toys, shotacon, sister, sleeping, sole male, squirting, stockings, story arc, sweating, tanlines, teacher, unusual pupils, wet clothes, x-ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Groups**: group, maron maron<br><br>**Languages**: english, translated<br><br>**Category**: artist cg<br><br>**Pages**: 566<br><br>**Alternative title**: \[まろん☆まろん\] ガキにもどって犯りなおしっ!!! \[英訳\] |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 566 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://m2.imhentai.xxx/.../1.jpg` (image/jpeg, 76588 bytes, 560x420) |  |  |  |
