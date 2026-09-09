# Extension Validation Report

- Extension: tachiyomi-en.mangafreak-v1.4.15
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1201694572804778862
- Source name: Mangafreak
- Source language: en
- Selected manga input: latest offset 0: Intaishita Ossan Kenjada Ga Manadeshi Ga Tsuihou Sarete Kita No De Shoushin Ryokou Ni Tsureteiku Surouraifu Na Tabi No Tsumori Ga Nazeka Sekai Saikyou No Shitei Ni Natte Ita (`.../Intaishita_Ossan_Kenjada_Ga_Manadeshi_Ga_Tsuihou_Sarete_Kita_No_De_Shoushin_Ryokou_Ni_Tsureteiku_Surouraifu_Na_Tabi_No_Tsumori_Ga_Nazeka_Sekai_Saikyou_No_Shitei_Ni_Natte_Ita`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | One Piece (`.../One_Piece`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 15 | Shingeki no Kyojin (`.../Shingeki_No_Kyojin`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 217 | Intaishita Ossan Kenjada Ga Manadeshi Ga Tsuihou Sarete Kita No De Shoushin Ryokou Ni Tsureteiku Surouraifu Na Tabi No Tsumori Ga Nazeka Sekai Saikyou No Shitei Ni Natte Ita (`.../Intaishita_Ossan_Kenjada_Ga_Manadeshi_Ga_Tsuihou_Sarete_Kita_No_De_Shoushin_Ryokou_Ni_Tsureteiku_Surouraifu_Na_Tabi_No_Tsumori_Ga_Nazeka_Sekai_Saikyou_No_Shitei_Ni_Natte_Ita`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Intaishita Ossan Kenjada ga Manadeshi ga Tsuihou Sarete Kita no de Shoushin Ryokou ni Tsureteiku ~Surouraifu na Tabi no Tsumori ga, Nazeka Sekai Saikyou no Shitei ni Natte Ita~ (`.../Intaishita_Ossan_Kenjada_Ga_Manadeshi_Ga_Tsuihou_Sarete_Kita_No_De_Shoushin_Ryokou_Ni_Tsureteiku_Surouraifu_Na_Tabi_No_Tsumori_Ga_Nazeka_Sekai_Saikyou_No_Shitei_Ni_Natte_Ita`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Intaishita Ossan Kenjada Ga Manadeshi Ga Tsuihou Sarete Kita No De Shoushin Ryokou Ni Tsureteiku Surouraifu Na Tabi No Tsumori Ga Nazeka Sekai Saikyou No Shitei Ni Natte Ita (`.../Intaishita_Ossan_Kenjada_Ga_Manadeshi_Ga_Tsuihou_Sarete_Kita_No_De_Shoushin_Ryokou_Ni_Tsureteiku_Surouraifu_Na_Tabi_No_Tsumori_Ga_Nazeka_Sekai_Saikyou_No_Shitei_Ni_Natte_Ita`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 77 | Chapter 1 (`.../Read1_Intaishita_Ossan_Kenjada_Ga_Manadeshi_Ga_Tsuihou_Sarete_Kita_No_De_Shoushin_Ryokou_Ni_Tsureteiku_Surouraifu_Na_Tabi_No_Tsumori_Ga_Nazeka_Sekai_Saikyou_No_Shitei_Ni_Natte_Ita_1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 217 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Intaishita Ossan Kenjada ga Manadeshi ga Tsuihou Sarete Kita no de Shoushin Ryokou ni Tsureteiku ~Surouraifu na Tabi no Tsumori ga, Nazeka Sekai Saikyou no Shitei ni Natte Ita~, URL=`.../Intaishita_Ossan_Kenjada_Ga_Manadeshi_Ga_Tsuihou_Sarete_Kita_No_De_Shoushin_Ryokou_Ni_Tsureteiku_Surouraifu_Na_Tabi_No_Tsumori_Ga_Nazeka_Sekai_Saikyou_No_Shitei_Ni_Natte_Ita` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 10 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | FAIL | Invalid manga: popular entry 15: title=<blank>, URL=`.../Manga` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 248/248 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.mangafreak.me/.../intaishita_ossan_kenjada_ga_manadeshi_ga_tsuihou_sarete_kita_no_de_shoushin_ryokou_ni_tsureteiku_surouraifu_na_tabi_no_tsumori_ga_nazeka_sekai_saikyou_no_shitei_ni_natte_ita.jpg` (image/jpeg, 52080 bytes, 400x522) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Intaishita_Ossan_Kenjada_Ga_Manadeshi_Ga_Tsuihou_Sarete_Kita_No_De_Shoushin_Ryokou_Ni_Tsureteiku_Surouraifu_Na_Tabi_No_Tsumori_Ga_Nazeka_Sekai_Saikyou_No_Shitei_Ni_Natte_Ita` |  |  |  |
| details thumbnail URL | PASS | `https://images.mangafreak.me/.../intaishita_ossan_kenjada_ga_manadeshi_ga_tsuihou_sarete_kita_no_de_shoushin_ryokou_ni_tsureteiku_surouraifu_na_tabi_no_tsumori_ga_nazeka_sekai_saikyou_no_shitei_ni_natte_ita.jpg` |  |  |  |
| details author | PASS | This is ON-GOING series |  |  |  |
| details artist | PASS | Type: Manga |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Shounen |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | "Should we embark on an adventure as we used to?" Despite being an orphan, Roge put a lot of effort into his training and earned the nickname "Sage." Liliane, his cherished pupil, unexpectedly paid him a visit. "I have been expelled, Roge-sensei." Liliane had worked as a royal court wizard, but she was sacked without explanation after becoming weary of the demanding work environment and dubious interpersonal ties. Roge offers to take her on an adventure to ease her heartache and try to heal her weary heart. "Sensei, I wish we could go together and relive those wonderful times!" Following the routes they once took together, a leisurely voyage commences. However, the two, who are both too gifted for their own good, wind up leaving legends in their wake everywhere they go. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 77 chapters |  |  |  |
| chapter dates | PASS | 77 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.mangafreak.me/.../intaishita_ossan_kenjada_ga_manadeshi_ga_tsuihou_sarete_kita_no_de_shoushin_ryokou_ni_tsureteiku_surouraifu_na_tabi_no_tsumori_ga_nazeka_sekai_saikyou_no_shitei_ni_natte_ita_1_1.jpg` (image/jpeg, 456402 bytes, 720x6627) |  |  |  |
