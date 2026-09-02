# Extension Validation Report

- Extension: tachiyomi-all.hentaihand-v1.4.11
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.w
- Source ID: 1438773694780928937
- Source name: HentaiHand
- Source language: en
- Selected manga input: latest offset 0: Tsunade and her debt comic porn (`.../tsunade-and-her-debt-comic-porn`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | [Puu no Puupuupuu (Puuzaki Puuna)] Hitozukiai ga Nigate na Miboujin no Yukionna-san to Noroi no Yubiwa [English] (`.../puu-no-puupuupuu-puuzaki-puuna-hitozukiai-ga-nigate-na-miboujin-no-yukionna-san-to-noroi-no-yubiwa-english`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 18 | [Surumenium (Taniguchi Daisuke)] Kimi no Namida no Riyuu o Ore wa Mada Shiranai. [English] [desudesu] (`.../surumenium-taniguchi-daisuke-kimi-no-namida-no-riyuu-o-ore-wa-mada-shiranai-english-desudesu`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 18 | Tsunade and her debt comic porn (`.../tsunade-and-her-debt-comic-porn`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | On The Edge Of Spidercest – All New Spider-Man [Tracy Scops] (`.../on-the-edge-of-spidercest-all-new-spider-man-tracy-scops`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Tsunade and her debt comic porn (`.../tsunade-and-her-debt-comic-porn`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Tsunade and her debt comic porn (`.../tsunade-and-her-debt-comic-porn`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../tsunade-and-her-debt-comic-porn`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 12 |  |  | 10s+ |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tsunade and her debt comic porn, URL=`.../tsunade-and-her-debt-comic-porn` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.hentaihand.com/.../704464.webp` (image/webp (encoding: lossy), 48820 bytes, 949x1370) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tsunade-and-her-debt-comic-porn` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.hentaihand.com/.../704464.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Blowjob, Big Breasts, Ahegao, Milf, Paizuri, Big Ass, Huge Breasts, Mature, Big Cock, Blonde, Tsunade, Straight Sex, TV / Movies, Parody: Naruto, Blue Eyes, Parody: Boruto, Older Female Younger Male |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Description: Read Tsunade and her debt (ongoing), an adult comic image gallery featuring Ahegao, Big Ass, Big Breasts, Big Cock. Browse the complete chapter online. Tsunade and her debt comic porn is a 12-page porn comic. Genres: Big Breasts, Big Ass, MILF, Blowjob, Huge Breasts, Paizuri.<br><br>Pages: 12<br><br>Category: Porn Comic<br><br>Language: English |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.hentaihand.com/.../1.webp` (image/webp (encoding: lossy), 48820 bytes, 949x1370) |  |  |  |
