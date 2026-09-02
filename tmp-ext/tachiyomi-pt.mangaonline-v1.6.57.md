# Extension Validation Report

- Extension: tachiyomi-pt.mangaonline-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7203957529449460928
- Source name: Manga Online
- Source language: pt-BR
- Selected manga input: popular offset 0: Eternally Regressing Knight (`.../eternally-regressing-knight`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Eternally Regressing Knight (`.../eternally-regressing-knight`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Eu me Tornei o Gênio Bastardo de um Nobre Clã Sombrio (`.../eu-me-tornei-o-genio-bastardo-de-um-nobre-cla-sombrio`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Infinite Mage (`.../infinite-mage`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Escravo Das Sombras (`.../escravo-das-sombras`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Eternally Regressing Knight (`.../eternally-regressing-knight`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Eternally Regressing Knight (`.../eternally-regressing-knight`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 113 | Cap. 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Eternally Regressing Knight, URL=`.../eternally-regressing-knight` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaonline.green/.../1785431267258-32481e18a6a7.jpg` (image/jpeg, 349061 bytes, 1000x1414) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../eternally-regressing-knight` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Aventura, Artes Marciais, PEAK ARTE, Regressão |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \[Do mesmo estúdio de “The Greatest Estate Developer”!\]\[E do mesmo autor de “De Soldado a Monarca” e “Genius of the Unique Lineage”!\]\[Acompanhe a novel em nosso site também “Ta com pouco capítulos ainda porque acompanhamos a versão em inglês dela”\]“Você é um gênio” Essas palavras que ele ouviu quando criança o envenenaram. Encrid sonhou em se tornar um cavaleiro, mas ele logo percebeu que era fútil. “Você quer viver pela espada com esse nível de habilidade?” Alguns riram dele, “Apenas desista”, alguns o advertiram. Apesar disso, seu sonho permaneceu firme. Ele dormiu menos, correu mais, e treinou ainda mais duro. Um dia, ele morreu, sendo esfaqueado no pescoço. Encrid abriu seus olhos de novo para “hoje de manhã”. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 113 chapters |  |  |  |
| chapter dates | LINT | All 113 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=113 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mangaonline.green/.../1784298461074-786f7a413fe2.webp` (image/webp (encoding: lossy), 275702 bytes, 1840x1380) |  |  |  |
