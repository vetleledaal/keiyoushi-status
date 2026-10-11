# Extension Validation Report

- Extension: tachiyomi-pt.fenixproject-v1.6.59
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8852449878379679769
- Source name: Fenix Project
- Source language: pt-BR
- Selected manga input: popular offset 0: A Senhorita Monstro e o Paladino (`.../a-senhorita-monstro-e-o-paladino`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | A Senhorita Monstro e o Paladino (`.../a-senhorita-monstro-e-o-paladino`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | Doentia Devoção (`.../doentia-devocao`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Senhorita Monstro e o Paladino (`.../a-senhorita-monstro-e-o-paladino`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Senhorita Monstro e o Paladino (`.../a-senhorita-monstro-e-o-paladino`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 62 | Capítulo 01 - Capítulo 01 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Senhorita Monstro e o Paladino, URL=`a-senhorita-monstro-e-o-paladino` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://fenixproject.website/.../480.webp` (image/webp (encoding: lossy), 32800 bytes, 480x643) |  |  |  |
| details identity | PASS | Details preserved selected URL `a-senhorita-monstro-e-o-paladino` |  |  |  |
| details thumbnail URL | PASS | `https://fenixproject.website/.../480.webp` |  |  |  |
| details author | PASS | Songeum |  |  |  |
| details artist | PASS | Surreuk Comics |  |  |  |
| details genres | PASS | Drama, Fantasia, Dark Romance, Histórico, Josei |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "Eu gostaria que você me amasse, a ponto de se perder." Aos vinte anos, Verônica perdeu tudo. Sua cidade natal, seus amigos, sua família e até mesmo seu futuro como ser humano. Seus olhos vermelhos, fundidos com o monstro dentro dela, revelam apenas visões horríveis... Mas Leon Berg, um homem que já foi um cavaleiro sagrado, faz-lhe uma oferta. “Mesmo que você tenha que rastejar pelo fogo do inferno, diga-me se você quer viver.” “Acredito que só você pode pôr fim a este desastre.” A única coisa que pode salvar uma mulher transformada em monstro é um beijo impregnado do sopro dos deuses. Ao receber o beijo de um homem que nunca poderia amá-la, Verônica pensa: eu queria... que você me amasse. Quem está traduzindo a obra é a EUTANÁSIA SCAN! A Fênix Project está apenas hospedando, deem muito amor a ela, por favor <3 Entrem no grupo dela no Telegram: https://t.me/.../+ufadky7jGRxkZDVh |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 62 chapters |  |  |  |
| chapter dates | LINT | 52 of 62 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=52 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://fenixproject.website/.../01.jpg` (image/jpeg, 756687 bytes, 1000x12745) |  |  |  |
