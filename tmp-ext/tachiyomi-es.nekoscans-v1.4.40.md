# Extension Validation Report

- Extension: tachiyomi-es.nekoscans-v1.4.40
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8396340084333456288
- Source name: NekoScans
- Source language: es
- Selected manga input: latest offset 0: Tokage no ryoushu-sama (`.../tokage-no-ryoushu-sama`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Cruzando los muros del amor contigo (`.../kimi-to-koete-koi-ni-naru`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Hana y el Hombre bestia color (`.../hana-y-el-hombre-bestia-color`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Tokage no ryoushu-sama (`.../tokage-no-ryoushu-sama`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | El cariñoso dragón negro y su novia sacrificada (`.../abaki-nakase-sosogitai-dekiai-kokuryu-to-ikenie-hanayome`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Tokage no ryoushu-sama (`.../tokage-no-ryoushu-sama`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Tokage no ryoushu-sama (`.../tokage-no-ryoushu-sama`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 27 | Chapter Personajes (`.../tokage-no-ryoushu-sama-personajes`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 6 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tokage no ryoushu-sama, URL=`.../tokage-no-ryoushu-sama` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../70870983_p0.jpg <redacted query values: resize>` (image/jpeg, 18328 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tokage-no-ryoushu-sama` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../70870983_p0.jpg` (image/jpeg, 246083 bytes, 829x1200) |  |  |  |
| details author | PASS | KOMAMOTO Izumi |  |  |  |
| details artist | PASS | Daisuke |  |  |  |
| details genres | PASS | +18, Acción, Novela, Smut, Sobrenatural, Novel |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Una historia sobre un hombre lagarto y una humana, ¡historia que trasciende la raza y el estatus! Catalina fue sido destinada a un pueblo remoto como ayudante del jefe de una aldea por una razón determinada. Su nuevo jefe, el señor, es un hombre con aspecto de lagarto, amable y apacible… Comienza una historia que jamás se había visto: un hombre lagarto de gran corazón y una joven de corazón negro y serio. Los personajes son hombres lagarto durante toda la historia. No hay humanización, etc.<br><br>Nombres alternativos: El señor de los lagartos, トカゲの領主様 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 27 chapters |  |  |  |
| chapter dates | PASS | 27 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../katarina.png` (image/png, 16649 bytes, 100x100) |  |  |  |
