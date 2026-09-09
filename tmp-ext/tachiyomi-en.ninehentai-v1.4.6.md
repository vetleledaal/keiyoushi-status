# Extension Validation Report

- Extension: tachiyomi-en.ninehentai-v1.4.6
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
- Source ID: 7689490563697355048
- Source name: NineHentai
- Source language: en
- Selected manga input: latest offset 0: [Botamochi] Masaka Ano Oni Joushi ga Ore no SeFri ni Naru nante... 4 ~ Oni Joushi to Kokoro to Karada Kasaneru Jun'ai Kekkon Shoya | I never thought that diabolical boss would become my sex friend 4 [English] [MTL] (`.../150648`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | I'll turn a divorced woman and a nagging housewife into ripe, voluptuous sex toys with their complicated pasts [Gagrin kichi] (MTL) (`.../150140`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 18 | [Chinetsu] The Pure And Gentle Girl (`.../150459`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | [Botamochi] Masaka Ano Oni Joushi ga Ore no SeFri ni Naru nante... 4 ~ Oni Joushi to Kokoro to Karada Kasaneru Jun'ai Kekkon Shoya | I never thought that diabolical boss would become my sex friend 4 [English] [MTL] (`.../150648`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | [Bitch☆Goigostar] Innyuu Karakuri Kitan [Digital] (`.../150631`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 18 | [Botamochi] Masaka Ano Oni Joushi ga Ore no SeFri ni Naru nante... 4 ~ Oni Joushi to Kokoro to Karada Kasaneru Jun'ai Kekkon Shoya | I never thought that diabolical boss would become my sex friend 4 [English] [MTL] (`.../150648`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | [Botamochi] Masaka Ano Oni Joushi ga Ore no SeFri ni Naru nante... 4 ~ Oni Joushi to Kokoro to Karada Kasaneru Jun'ai Kekkon Shoya | I never thought that diabolical boss would become my sex friend 4 [English] [MTL] (`.../150648`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../150648`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 88 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Botamochi\] Masaka Ano Oni Joushi ga Ore no SeFri ni Naru nante... 4 ~ Oni Joushi to Kokoro to Karada Kasaneru Jun'ai Kekkon Shoya \| I never thought that diabolical boss would become my sex friend 4 \[English\] \[MTL\], URL=`.../150648` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 90/90 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 90/90 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.9hentai.so/.../cover-small.jpg` (image/jpeg, 41136 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../150648` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i.9hentai.so/.../cover.jpg` (image/jpeg, 73145 bytes, 350x496) |  |  |  |
| details author | PASS | Satou To Shio |  |  |  |
| details artist | PASS | Botamochi |  |  |  |
| details genres | PASS | Big Areolae, Big Ass, Big Breasts, Bikini, Breast Feeding, Bride, Milf, Mosaic Censorship, Multi-work Series, Rough Translation |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Alternative Title: \[ぼたもち\] まさかあの鬼上司が俺のセフレになるなんて...4〜鬼上司と心とカラダ重ねる純愛 結婚初夜〜 \[スペイン翻訳\]<br><br>Pages: 88 pages<br><br>Category: Doujinshi<br><br>Language: English |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 88 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.9hentai.so/.../1.jpg` (image/jpeg, 303663 bytes, 1280x960) |  |  |  |
