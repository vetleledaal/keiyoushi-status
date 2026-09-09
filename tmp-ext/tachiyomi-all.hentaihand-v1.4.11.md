# Extension Validation Report

- Extension: tachiyomi-all.hentaihand-v1.4.11
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.w
- Source theme: hentaihand
- Source ID: 1438773694780928937
- Source name: HentaiHand
- Source language: en
- Selected manga input: latest offset 0: [R.S.I. (Rim)] JD 3-ningumi Tai Inou Mochi Oji-san-tachi [English] [Digital] (`.../rsi-rim-jd-3-ningumi-tai-inou-mochi-oji-san-tachi-english-digital`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | [Puu no Puupuupuu (Puuzaki Puuna)] Hitozukiai ga Nigate na Miboujin no Yukionna-san to Noroi no Yubiwa [English] (`.../puu-no-puupuupuu-puuzaki-puuna-hitozukiai-ga-nigate-na-miboujin-no-yukionna-san-to-noroi-no-yubiwa-english`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 18 | [Surumenium (Taniguchi Daisuke)] Kimi no Namida no Riyuu o Ore wa Mada Shiranai. [English] [desudesu] (`.../surumenium-taniguchi-daisuke-kimi-no-namida-no-riyuu-o-ore-wa-mada-shiranai-english-desudesu`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | [R.S.I. (Rim)] JD 3-ningumi Tai Inou Mochi Oji-san-tachi [English] [Digital] (`.../rsi-rim-jd-3-ningumi-tai-inou-mochi-oji-san-tachi-english-digital`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | [Sevengar] Mesuchinpo Gari Ch. 1 [English] [CarlJPTL] (`.../sevengar-mesuchinpo-gari-ch-1-english-carljptl`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | [R.S.I. (Rim)] JD 3-ningumi Tai Inou Mochi Oji-san-tachi [English] [Digital] (`.../rsi-rim-jd-3-ningumi-tai-inou-mochi-oji-san-tachi-english-digital`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | [R.S.I. (Rim)] JD 3-ningumi Tai Inou Mochi Oji-san-tachi [English] [Digital] (`.../rsi-rim-jd-3-ningumi-tai-inou-mochi-oji-san-tachi-english-digital`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../rsi-rim-jd-3-ningumi-tai-inou-mochi-oji-san-tachi-english-digital`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 45 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[R.S.I. (Rim)\] JD 3-ningumi Tai Inou Mochi Oji-san-tachi \[English\] \[Digital\], URL=`.../rsi-rim-jd-3-ningumi-tai-inou-mochi-oji-san-tachi-english-digital` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.hentaihand.com/.../706585.webp` (image/webp (encoding: lossy), 27644 bytes, 700x988) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../rsi-rim-jd-3-ningumi-tai-inou-mochi-oji-san-tachi-english-digital` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.hentaihand.com/.../706585.webp` |  |  |  |
| details author | PASS | Rim |  |  |  |
| details artist | PASS | Rim |  |  |  |
| details genres | PASS | Group, Mind Control, Big Breasts, Full Color, Kimono, Ffm Threesome, Bald, Big Areolae, Emotionless Sex |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Alternative Title: JD 3-ningumi Tai Inou Mochi Oji-san-tachi<br><br>Groups: R.s.i.<br><br>Pages: 45<br><br>Category: Doujinshi<br><br>Language: English<br><br>Parodies: Original |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.hentaihand.com/.../1.webp` (image/webp (encoding: lossy), 181944 bytes, 1280x1807) |  |  |  |
