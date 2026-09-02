# Extension Validation Report

- Extension: tachiyomi-all.nhentaicom-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.p
- Source ID: 5591830863732393712
- Source name: nHentai.com (unoriginal)
- Source language: en
- Selected manga input: popular offset 0: [Puu no Puupuupuu (Puuzaki Puuna)] Hitozukiai ga Nigate na Miboujin no Yukionna-san to Noroi no Yubiwa [English] (`.../puu-no-puupuupuu-puuzaki-puuna-hitozukiai-ga-nigate-na-miboujin-no-yukionna-san-to-noroi-no-yubiwa-english`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | [Puu no Puupuupuu (Puuzaki Puuna)] Hitozukiai ga Nigate na Miboujin no Yukionna-san to Noroi no Yubiwa [English] (`.../puu-no-puupuupuu-puuzaki-puuna-hitozukiai-ga-nigate-na-miboujin-no-yukionna-san-to-noroi-no-yubiwa-english`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 18 | [Surumenium (Taniguchi Daisuke)] Kimi no Namida no Riyuu o Ore wa Mada Shiranai. [English] [desudesu] (`.../surumenium-taniguchi-daisuke-kimi-no-namida-no-riyuu-o-ore-wa-mada-shiranai-english-desudesu`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Tsunade and her debt comic porn (`.../tsunade-and-her-debt-comic-porn`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | On The Edge Of Spidercest – All New Spider-Man [Tracy Scops] (`.../on-the-edge-of-spidercest-all-new-spider-man-tracy-scops`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | [Puu no Puupuupuu (Puuzaki Puuna)] Hitozukiai ga Nigate na Miboujin no Yukionna-san to Noroi no Yubiwa [English] (`.../puu-no-puupuupuu-puuzaki-puuna-hitozukiai-ga-nigate-na-miboujin-no-yukionna-san-to-noroi-no-yubiwa-english`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [Puu no Puupuupuu (Puuzaki Puuna)] Hitozukiai ga Nigate na Miboujin no Yukionna-san to Noroi no Yubiwa [English] (`.../puu-no-puupuupuu-puuzaki-puuna-hitozukiai-ga-nigate-na-miboujin-no-yukionna-san-to-noroi-no-yubiwa-english`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../puu-no-puupuupuu-puuzaki-puuna-hitozukiai-ga-nigate-na-miboujin-no-yukionna-san-to-noroi-no-yubiwa-english`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 71 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Puu no Puupuupuu (Puuzaki Puuna)\] Hitozukiai ga Nigate na Miboujin no Yukionna-san to Noroi no Yubiwa \[English\], URL=`.../puu-no-puupuupuu-puuzaki-puuna-hitozukiai-ga-nigate-na-miboujin-no-yukionna-san-to-noroi-no-yubiwa-english` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.nhentai.com/.../341631.jpg` (image/jpeg, 48339 bytes, 700x995) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../puu-no-puupuupuu-puuzaki-puuna-hitozukiai-ga-nigate-na-miboujin-no-yukionna-san-to-noroi-no-yubiwa-english` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.nhentai.com/.../341631.jpg` |  |  |  |
| details author | PASS | Zeroshiki Kouichi \| Puuzaki Puuna |  |  |  |
| details artist | PASS | Zeroshiki Kouichi \| Puuzaki Puuna |  |  |  |
| details genres | PASS | Big Breasts, Sole Female, Sole Male, Stockings, Blowjob, Full Color, Mosaic Censorship, Milf, Femdom, Pantyhose, Mind Control, Garter Belt, Deepthroat, Widow, Domination Loss, Older Female Younger Male |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Alternative Title: \[ぷぅのぷぅぷぅぷぅ (ぷぅ崎ぷぅ奈)\] 人付き合いが苦手な未亡人の雪女さんと呪いの指輪 \[英訳\]<br><br>Groups: Puu No Puupuupuu<br><br>Pages: 71<br><br>Category: Doujinshi<br><br>Language: English<br><br>Parodies: Original |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 71 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.nhentai.com/.../1.jpg` (image/jpeg, 271443 bytes, 1280x1819) |  |  |  |
